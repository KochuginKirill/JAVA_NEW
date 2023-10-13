package OOP_DZ1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    LocalDate currentDate;
    LocalDate lastTake;

    public DepositAccount(double putIn) {
        super(putIn);
        this.currentDate = null;
        this.lastTake = null;
    }

    @Override
    public void take(double putIn) {
        this.currentDate = LocalDate.now();
        if((this.lastTake == null) || this.currentDate.minusMonths(2).isAfter(this.lastTake)) {
            this.balance -= (putIn);
            this.lastTake = currentDate;
        }
    }
}



