package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.ControlPage;
import pages.TransferMoney;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class us_16MoneyTransferStep {

    ControlPage controlPage = new ControlPage();
    TransferMoney transferMoney = new TransferMoney();

    @And("click Transfer Money")
    public void clickTransferMoney() {
        controlPage.MoneyTransfer.click();
        ReusableMethods.waitFor(2);
    }

    @Given("user selects the first account as From dropdown")
    public void userSelectsTheFirstAccountAsFromDropdown() {
        Select select = new Select(transferMoney.FromAccount);
        select.selectByIndex(1);
        ReusableMethods.waitFor(2);
    }

    @And("user selects the second account as To dropdown")
    public void userSelectsTheSecondAccountAsToDropdown() {
        Select toDropDown = new Select(transferMoney.ToAccount);
        toDropDown.selectByIndex(1);
        ReusableMethods.waitFor(2);
    }

    @And("user clicks on Balance textbox and enters {string} dollars and press tab")
    public void userClicksOnBalanceTextboxAndEntersDollarsAndPressTab(String balance) {
        transferMoney.BalanceDollars.sendKeys(balance + Keys.TAB);
        ReusableMethods.waitFor(2);
    }

    @And("user enters {string} cents")
    public void userEntersCents(String cents) {
        transferMoney.BalanceCents.sendKeys(cents);
        ReusableMethods.waitFor(2);
    }

    @And("user provides description as {string}")
    public void userProvidesDescriptionAs(String description) {
        transferMoney.description.sendKeys(description);
        ReusableMethods.waitFor(2);
    }

    @And("user clicks Make Transfer button")
    public void userClicksMakeTransferButton() {
        transferMoney.MakeTransferButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("verify user transfers money validating the message an amount of the transaction")
    public void verifyUserTransfersMoneyValidatingTheMessageAnAmountOfTheTransaction() {
        ReusableMethods.waitForVisibility(transferMoney.successMessage, 3);
        Assert.assertTrue(transferMoney.successMessage.isDisplayed());
        ReusableMethods.waitFor(2);;
    }

    @Given("click From dropdown")
    public void clickFromDropdown() {
        transferMoney.FromAccount.click();
    }

    @Then("verify that user has at least two accounts or more to make money transfer with own and others")
    public void verifyThatUserHasAtLeastTwoAccountsOrMoreToMakeMoneyTransferWithOwnAndOthers() {
        Select select = new Select(transferMoney.FromAccount);
        Assert.assertTrue(select.getOptions().size()>=2);
    }

    @Then("user sees that all fields should be filled validating error messages")
    public void userSeesThatAllFieldsShouldBeFilledValidatingErrorMessages() {
        Assert.assertEquals("form-control is-touched is-pristine av-invalid is-invalid form-control",
                transferMoney.FromAccount.getAttribute("class"));
        Assert.assertEquals("form-control is-touched is-pristine av-invalid is-invalid form-control",
                transferMoney.ToAccount.getAttribute("class"));

        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//*[text()='This field is required.']"));
        System.out.println(elements);
        System.out.println("Number of elements:" +elements.size());
        for (int i=0; i<elements.size();i++){
            System.out.println("Error empty field message ===>" + elements.get(i).getText());
        }
        Assert.assertTrue("All fields are required ", elements.size() == 2);

    }
}



