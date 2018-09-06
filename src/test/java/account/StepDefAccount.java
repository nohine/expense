package account;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefAccount {
    Account account;

    @Before
    public void init() {
        account = new Account();

    }
    @When("I addIcome (.*) to account")
    public void i_addIncome_to_account(double amount) throws NotEnoughBalanceException {
        account.addIncome(amount);
    }

    @Then("my account balance is (.*)")
    public void my_account_balance_is(double balance) {
        assertEquals(balance, account.getBalance());
    }

    @When("I addExpense (.*) to my account (\\d+)")
    public void i_addExpense_to_my_account(double amount) throws NotEnoughBalanceException {
        account.addExpense( amount);
    }

    @Then("my account balance is (.*)")
    public void my_account_balance_is_expense(double balance) {
        assertEquals(balance, account.getBalance());
    }


}
