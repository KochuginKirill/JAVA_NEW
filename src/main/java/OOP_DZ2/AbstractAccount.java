package OOP_DZ2;

public abstract class AbstractAccount implements Amount {
    protected double balance;

    public AbstractAccount(double putIn) {
        this.balance = putIn;
    }

    @Override
    public double put(double putIn) {
        if(putIn >= 0) {
            this.balance += putIn;
            return this.balance;
        }else {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
    }

    @Override
    public double take(double putIn) {
        if(putIn >= 0) {
            this.balance -= putIn;
            return this.balance;
        }else {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
    }

    @Override
    public double get() {
        return balance;
    }

}
