package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ReusableMethods;

public class NewCustomerRegister_US01 {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user click the user icon")
    public void user_click_the_user_icon() {
        homePage.accountdropdown.click();
    }

    @Then("user click the register")
    public void userClickTheRegister() {
        homePage.register.click();
    }

    //////////////////////////////////////////////

    @Given("click ssnTextBox")
    public void click_ssnTextBox() {
       registrationPage.ssnTextBox.click();
    }


    @Given("click firstNameTextBox")
    public void clickFirstNameTextBox() {
        registrationPage.firstNameTextBox.click();
    }

    //////////////////////////////////////////////

    @Given("enter ssn number {string}")
    public void enter_ssn_number(String string) {
        registrationPage.ssnTextBox.sendKeys(string);
    }

    @And("enter first name {string}")
    public void enterFirstName(String string) {
        registrationPage.firstNameTextBox.sendKeys(string);
    }

    @And("enter last name {string}")
    public void enterLastName(String string) {
        registrationPage.lastNameTextBox.sendKeys(string);
    }

    @And("enter address {string}")
    public void enterAddress(String string) {
        registrationPage.addressTextBox.sendKeys(string);
    }

    @And("enter Phone number {string}")
    public void enterPhoneNumber(String string) {
        registrationPage.mobilephoneTextBox.sendKeys(string);
    }

    @And("enter username {string}")
    public void enterUsername(String string) {
        registrationPage.usernameTextBox.sendKeys(string);
    }

    @And("enter email {string}")
    public void enterEmail(String string) {
        registrationPage.emailTextBox.sendKeys(string);
    }

    @And("enter new password {string}")
    public void enterNewPassword(String string) {
        registrationPage.firstPasswordTextBox.sendKeys(string);
    }

    @And("enter password confirmation {string}")
    public void enterPasswordConfirmation(String string) {
        registrationPage.secondPasswordTextBox.sendKeys(string);
    }

    //////////////////////////////////////////////

    @Then("verify user enter {string} successfully")
    public void verify_user_enter_successfully(String string) {
        ReusableMethods.waitForVisibility(registrationPage.succesfulRegisterMessage, 5);
        Assert.assertTrue(registrationPage.succesfulRegisterMessage.isDisplayed());
    }

    @Then("verify system does not accept invalid {string}")
    public void verify_system_does_not_accept_invalid(String string) {
        ReusableMethods.waitForVisibility(registrationPage.errorSsnExists, 5);
        Assert.assertTrue(registrationPage.errorSsnExists.isDisplayed());
    }

}
