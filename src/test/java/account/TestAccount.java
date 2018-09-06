package account;

import cucumber.api.java.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by 708 on 8/31/2018.
 */
public class TestAccount {
    Account account;
    int balance = 200;

    @BeforeEach
    void init() {
        account = new Account(balance);
    }

    @Test
    void testAddIncome() {
        account.addIncome(30);
        assertEquals(230, account.getBalance());
        assertEquals(20, account.getIncome());
        account.addIncome(50);
        assertEquals(280, account.getBalance());
        assertEquals(80, account.getIncome());
        account.addIncome(40);
        assertEquals(320, account.getBalance());
        assertEquals(120, account.getIncome());

    }

    @Test
    void testAddExpense() {
        account.addExpense(20);
        assertEquals(180, account.getBalance());
        assertEquals(20, account.getExpense());
        account.addExpense(40);
        assertEquals(140, account.getBalance());
        assertEquals(60, account.getExpense());
        account.addExpense(30);
        assertEquals(110, account.getBalance());
        assertEquals(90, account.getExpense());
    }

}
