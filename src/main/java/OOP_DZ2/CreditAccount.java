package OOP_DZ2;

public class CreditAccount extends AbstractAccount {

    public CreditAccount(double putIn) {
        super(putIn);
    }

    @Override
    public double take(double putIn) {
        if(putIn >= 0) {
            this.balance -= (putIn+(putIn / 100));
            return this.balance;
        } else {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
    }


}


