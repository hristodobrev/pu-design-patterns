package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    private double calculatePrice() {
        return this.products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(this.calculatePrice());
    }
}
