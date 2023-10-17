package OOP_DZ2;

import java.time.LocalDate;

public class DepositAccount extends AbstractAccount {
    LocalDate currentDate;
    LocalDate lastTake;

    public DepositAccount(double putIn) {
        super(putIn);
        this.currentDate = null;
        this.lastTake = null;
    }

    @Override
    public double take(double putIn) {
        this.currentDate = LocalDate.now();
        if((this.lastTake == null) || this.currentDate.minusMonths(2).isAfter(this.lastTake)) {
            this.balance -= (putIn);
            this.lastTake = currentDate;
        }
        throw new IllegalArgumentException("Два месяца с последнего снятия еще не прошло");
    }
}



