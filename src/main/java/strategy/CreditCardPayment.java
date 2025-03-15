package strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You have paid $" + amount +
                " with credit card **** **** **** " +
                cardNumber.substring(cardNumber.length() - 4, cardNumber.length())
        );
    }
}
