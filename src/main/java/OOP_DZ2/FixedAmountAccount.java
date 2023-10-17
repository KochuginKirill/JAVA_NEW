package OOP_DZ2;

import java.time.LocalDate;

public class FixedAmountAccount extends AbstractAccount{
    public FixedAmountAccount(double putIn) {
        super(putIn);
    }

    @Override
    public double put(double putIn) {
        return this.balance;
    }

    @Override
    public double take(double putIn) {
        return this.balance;
    }
}
