package OOP_DZ1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CreditAccountTest {
    @Test
    public void testCreditAccount(){
        CreditAccount testCredit = new CreditAccount(0);
        testCredit.put(1000);
        testCredit.take(100);
        Assertions.assertEquals((1000 - 1.01*100), testCredit.getAmount());
    }

}