package OOP_DZ1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class DepositAccountTest {
    @Test
    public void testDepositAccount1(){
        DepositAccount testDeposit = new DepositAccount(0);
        testDeposit.put(100);
        testDeposit.take(10);
        Assertions.assertEquals(testDeposit.currentDate, testDeposit.lastTake);
    }
}