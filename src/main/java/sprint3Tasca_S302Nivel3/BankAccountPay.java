package sprint3Tasca_S302Nivel3;

public class BankAccountPay implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Pay by bank account");
    }
}
