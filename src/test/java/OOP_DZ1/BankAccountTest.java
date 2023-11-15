package OOP_DZ1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    public void testBankAccountput(){
        BankAccount testAccount = new BankAccount(0);
        testAccount.put(11);
        Assertions.assertEquals(11, testAccount.getAmount());
    }
    @Test
    public void testBankAccount(){
        BankAccount testAccount = new BankAccount(0);
        testAccount.put(10);
        testAccount.take(5);
        Assertions.assertEquals(5, testAccount.getAmount());
    }

}