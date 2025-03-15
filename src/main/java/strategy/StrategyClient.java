package strategy;

public class StrategyClient {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("Phone", 1200));
        shoppingCart.addProduct(new Product("Laptop", 1700));
        //shoppingCart.pay(new PayPalPayment("test@test.com", "pass123"));
        shoppingCart.pay(new CreditCardPayment("1234567812345678", "436"));
    }
}
