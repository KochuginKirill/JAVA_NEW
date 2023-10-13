package OOP_DZ1;

public class CreditAccount extends BankAccount {

    public CreditAccount(double putIn) {
        super(putIn);
    }

    @Override
    public void take(double putIn) {
        this.balance -= (putIn+(putIn / 100));
    }
}


