package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ControlPage;
import pages.CustomerAccounts;


import utilities.ReusableMethods;

public class US_015_CustomerAccounts {

    ControlPage controlPage = new ControlPage();
    CustomerAccounts customerAccounts = new CustomerAccounts();



    @Then("click My Accounts")
    public void click_my_accounts() {
        controlPage.myAccounts.click();
    }

    @Then("verify both of the account types")
    public void verify_both_of_the_account_types() {
        ReusableMethods.waitForVisibility(customerAccounts.Account1Type,10);
        Assert.assertTrue(customerAccounts.Account1Type.isDisplayed());
        Assert.assertTrue(customerAccounts.Account2Type.isDisplayed());

    }

    @Then("verify both of the account balances")
    public void verify_both_of_the_account_balances() {
        ReusableMethods.waitForVisibility(customerAccounts.Account1Type,10);
        Assert.assertTrue(customerAccounts.Account1Balance.isDisplayed());
        Assert.assertTrue(customerAccounts.Account2Balance.isDisplayed());
    }

    @Given("click first view transaction button")
    public void clickFirstViewTransactionButton() {
        customerAccounts.TransactionButton1.click();
    }

    @Then("verify transaction elements")
    public void verifyTransactionElements() {
        Assert.assertTrue(customerAccounts.TransactionID.isDisplayed());
        Assert.assertTrue(customerAccounts.TransactionAccountID.isDisplayed());
        Assert.assertTrue(customerAccounts.TransactionDescription.isDisplayed());
        Assert.assertTrue(customerAccounts.TransactionDate.isDisplayed());
        Assert.assertTrue(customerAccounts.TransactionAmount.isDisplayed());
        Assert.assertTrue(customerAccounts.TransactionNewBalance.isDisplayed());
    }

    @Then("click second view transaction button")
    public void clickSecondViewTransactionButton() {
        customerAccounts.TransactionButton2.click();
    }

}
