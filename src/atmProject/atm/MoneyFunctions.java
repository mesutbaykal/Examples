package atmProject.atm;

public interface MoneyFunctions {

    double withdraw(double amount);// default public abstract
    double checkBalance();
    double deposit(double amount);
    boolean transfer(long accountNumber, double amount);
}
