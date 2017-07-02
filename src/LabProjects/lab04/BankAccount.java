/**
 * Created by user on 6/20/2017.
 */
public class BankAccount {

    private double balance;
    private String name;

    public BankAccount() {
        balance = 0.0;
        name = "N/A";
    }

    public BankAccount(String name, double amount) {
        this.balance = amount;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    public void transfer(double amount, BankAccount receiver) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            receiver.setBalance(receiver.getBalance()+amount);
        }
    }
}
