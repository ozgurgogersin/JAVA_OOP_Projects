package BankATM_App;

public class Account {
    private String username;
    private String password;
    private double balance;

    public Account() {
        this.username = "username";
        this.password = "password";
        this.balance = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void depositMoney(double amount) {

        this.balance += amount;
    }

    public void withdrawMoney(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else if (balance < amount) {
            double remain;
            remain = amount - this.balance;
            System.out.println("Insufficient balance, add " + remain + " USD deposit for withdraw");
        }
    }
}
