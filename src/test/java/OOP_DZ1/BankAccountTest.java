package OOP_DZ1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void getAmount() {
        BankAccount testing = new BankAccount(0);
        assertEquals(0, testing.getAmount());
    }
}