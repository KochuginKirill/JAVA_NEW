package OOP_DZ1;

public class BankAccount {
    double balance;

    public BankAccount(double putIn) {
        this.balance = putIn;
    }

    public void put(double putIn){
        this.balance += putIn;
    }
    public void take(double putIn){
        this.balance -= putIn;
    }


    public double getAmount() {
        return balance;
    }
}
