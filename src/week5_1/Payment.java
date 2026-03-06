package week5_1;

public interface Payment {
    boolean validateDetails();

    boolean processPayment(double amount);

    String generateReceipt();

}
