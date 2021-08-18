package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegistrationUISteps {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();

    String ssn;
    String firstName;
    String lastName;
    String userAddress;
    String mobilephone;
    String username;
    String userEmail;
    String firstPassword;
    String secondPassword;

    @And("user click the register")
    public void userClickTheRegister() {
        homePage.accountdropdown.click();
        homePage.register.click();
    }

    @Given("user enters ssn number as  {string}")
    public void userEntersSsnNumberAs(String ssn) {
        ssn = faker.idNumber().ssnValid();
        this.ssn = ssn;
        Driver.waitAndSendText(registrationPage.ssnTextBox, ssn, 5);
    }

    @And("user enters firstname as {string}")
    public void userEntersFirstnameAs(String firstName) {
        firstName = faker.name().firstName();
        this.firstName = firstName;
        Driver.waitAndSendText(registrationPage.firstNameTextBox, firstName, 5);
    }

    @And("user enters lastname as {string}")
    public void userEntersLastnameAs(String lastName) {
        lastName = faker.name().lastName();
        this.lastName = lastName;
        Driver.waitAndSendText(registrationPage.lastNameTextBox, lastName, 5);
    }

    @And("user provides address as {string}")
    public void userProvidesAddressAs(String userAddress) {
        userAddress = faker.address().fullAddress();
        this.userAddress = userAddress;
        Driver.waitAndSendText(registrationPage.addressTextBox, userAddress, 5);
    }

    @And("user provides mobilephone as {string}")
    public void userProvidesMobilephoneAs(String mobilephone) {
        mobilephone = faker.phoneNumber().cellPhone();
        this.mobilephone = mobilephone;
        Driver.waitAndSendText(registrationPage.mobilephoneTextBox, mobilephone, 5);
    }

    @And("user provides a username as {string}")
    public void userProvidesAUsernameAs(String username) {
        username = faker.name().username();
        this.username = username;
        Driver.waitAndSendText(registrationPage.usernameTextBox, username, 5);
    }

    @And("user provides email id as {string}")
    public void userProvidesEmailIdAs(String userEmail) {
        userEmail = firstName + lastName + "@gmail.com";
        Driver.waitAndSendText(registrationPage.emailTextBox, userEmail, 5);
    }

    @And("user enter the password as {string}")
    public void userEnterThePasswordAs(String firstPassword) {
        firstPassword = faker.internet().password(8,12,true,true,true);
        this.firstPassword = firstPassword;
        Driver.waitAndSendText(registrationPage.firstPasswordTextBox, firstPassword, 5);
    }

    @And("user confirms the new password {string}")
    public void userConfirmsTheNewPassword(String secondPassword) {
        secondPassword = firstPassword;
        Driver.waitAndSendText(registrationPage.secondPasswordTextBox, secondPassword, 5);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton(){
        Driver.waitAndClick(registrationPage.registerButton, 10);
    }

    @Then("user sees the success message as {string}")
    public void userSeesTheSuccessMessageAs(String expectedMessage) {
        ReusableMethods.waitForVisibility(registrationPage.succesfulRegisterMessage, 5);
        Assert.assertTrue(registrationPage.succesfulRegisterMessage.isDisplayed());
    }

    @Given("user clicks ssnTextBox")
    public void userClicksSsnTextBox() {
        registrationPage.ssnTextBox.click();
    }

    @And("user clicks registerTitle")
    public void userClicksRegisterTitle() {
        registrationPage.registerTitle.click();
    }

    @Then("user sees the error message as {string} errorMessage_ssnExists")
    public void userSeesTheErrorMessageAsErrorMessage_ssnExists(String expectedErrorMessage) {
        ReusableMethods.waitForVisibility(registrationPage.errorSsnExists, 5);
        Assert.assertTrue(registrationPage.errorSsnExists.isDisplayed());
    }

    @Given("user clicks firstNameTextBox")
    public void userClicksFirstNameTextBox() {
        registrationPage.firstNameTextBox.click();
    }

    @Given("user clicks lastNameTextBox")
    public void userClicksLastNameTextBox() {
        registrationPage.lastNameTextBox.click();
    }

    @Given("user clicks addressTextBox")
    public void userClicksAddressTextBox() {
        registrationPage.addressTextBox.click();
    }

    @Given("user clicks mobilephoneTextBox")
    public void userClicksMobilephoneTextBox() {
        registrationPage.mobilephoneTextBox.click();
    }

    @Given("user clicks usernameTextBox")
    public void userClicksUsernameTextBox() {
        registrationPage.usernameTextBox.click();
    }

    @Given("user clicks emailTextBox")
    public void userClicksEmailTextBox() {
        registrationPage.emailTextBox.click();
    }

    @Then("user sees error message as {string} ssnInvalid")
    public void userSeesErrorMessageAsSsnInvalid(String arg0) {
    }

    @Then("user sees error message as {string} FirstNameInvalid")
    public void userSeesErrorMessageAsFirstNameInvalid(String arg0) {
    }

    @Then("user sees error message as {string} LastNameInvalid")
    public void userSeesErrorMessageAsLastNameInvalid(String arg0) {
    }

    @Then("user sees error message as {string} addressInvalid")
    public void userSeesErrorMessageAsAddressInvalid(String arg0) {
    }

    @Then("user sees error message as {string} mobilephoneInvalid")
    public void userSeesErrorMessageAsMobilephoneInvalid(String arg0) {
    }

    @Then("user sees error message as {string} usernameInvalid")
    public void userSeesErrorMessageAsUsernameInvalid(String arg0) {
    }

    @Then("user sees error message as {string} emailInvalid")
    public void userSeesErrorMessageAsEmailInvalid(String arg0) {
    }

    @Then("user sees error message as {string} emailAtLeastFiveChar")
    public void userSeesErrorMessageAsEmailAtLeastFiveChar(String arg0) {
    }

    @Given("user clicks ssnTextBox and press enter")
    public void userClicksSsnTextBoxAndPressEnter() {
        registrationPage.ssnTextBox.sendKeys(""+ Keys.ENTER);
    }

    @Then("user sees error message as ssnEmpty")
    public void userSeesErrorMessageAsSsnEmpty() {

    }

    @Then("user sees error message as firstNameEmpty")
    public void userSeesErrorMessageAsFirstNameEmpty() {
    }

    @Then("user sees error message as lastNameEmpty")
    public void userSeesErrorMessageAsLastNameEmpty() {
    }

    @Then("user sees error message as addressEmpty")
    public void userSeesErrorMessageAsAddressEmpty() {
    }

    @Then("user sees error message as mobilephoneEmpty")
    public void userSeesErrorMessageAsMobilephoneEmpty() {
    }

    @Then("user sees error message as usernameEmpty")
    public void userSeesErrorMessageAsUsernameEmpty() {
    }

    @Then("user sees error message as emailEmpty")
    public void userSeesErrorMessageAsEmailEmpty() {
    }

    @Then("user sees error message as firstPassword")
    public void userSeesErrorMessageAsFirstPassword() {
    }

    @Then("user sees error message as secondPassword")
    public void userSeesErrorMessageAsSecondPassword() {

    }
}
