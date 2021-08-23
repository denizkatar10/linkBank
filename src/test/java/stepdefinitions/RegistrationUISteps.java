package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;
import pages.RegistrationPage;
import pojos.Customer;
import pojos.User;
import utilities.*;

import java.util.List;

public class RegistrationUISteps {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    Faker faker = new Faker();
    Customer customer = new Customer();
    User user = new User();

    String filename = ConfigurationReader.getProperty("CustomerInformation.txt");
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
        customer.setSsn(ssn);
    }

    @And("user enters firstname as {string}")
    public void userEntersFirstnameAs(String firstName) {
        firstName = faker.name().firstName();
        this.firstName = firstName;
        Driver.waitAndSendText(registrationPage.firstNameTextBox, firstName, 5);
        customer.setFirstName(firstName);
    }

    @And("user enters lastname as {string}")
    public void userEntersLastnameAs(String lastName) {
        lastName = faker.name().lastName();
        this.lastName = lastName;
        Driver.waitAndSendText(registrationPage.lastNameTextBox, lastName, 5);
        customer.setLastName(lastName);
    }

    @And("user provides address as {string}")
    public void userProvidesAddressAs(String userAddress) {
        userAddress = faker.address().fullAddress();
        this.userAddress = userAddress;
        Driver.waitAndSendText(registrationPage.addressTextBox, userAddress, 5);
        customer.setAddress(userAddress);
    }

    @And("user provides mobilephone as {string}")
    public void userProvidesMobilephoneAs(String mobilephone) {
        mobilephone = faker.number().digits(3) + "-" + faker.number().digits(3) +"-" + faker.number().digits(4);
        this.mobilephone = mobilephone;
        Driver.waitAndSendText(registrationPage.mobilephoneTextBox, mobilephone, 5);
        customer.setMobilePhoneNumber(mobilephone);
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
        customer.setEmail(userEmail);
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
        System.out.println(filename + " Hi " + customer + ' ' + firstPassword + ' ' + username);
        WriteToTxt.saveAllCustomer(filename, customer, firstPassword, username);
        ReadTxt.returnAWholeUser(filename);
    }

    @Given("user clicks ssnTextBox")
    public void userClicksSsnTextBox() {
        registrationPage.ssnTextBox.click();
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

    @Given("user clicks ssnTextBox and press enter")
    public void userClicksSsnTextBoxAndPressEnter() {
        registrationPage.ssnTextBox.sendKeys(""+ Keys.ENTER);
    }


    @Then("user sees error message as {string}")
    public void userSeesErrorMessageAs(String string) {
//        String errorEmptySSN = "Your SSN is required";
//        String errorEmptyFirstName = "Your First Name is required";
//        String errorEmptyLastName = "Your Last Name is required";
//        String errorEmptyAddress = "Your Address is required";
//        String errorEmptyMobilePhone = "Your Mobile Phone Number is required";
//        String errorEmptyEmail = "Your email is required";
//        String errorEmptyFirstPassword = "Your password is required";
//        String errorEmptySecondPassword = "Your confirmation password is required";

//        Driver.wait(10);
//        WebElement element = driver.findElement(By.className("invalid-feedback"));
//        System.out.println(element);
//        List<WebElement> elements = driver.findElements(By.xpath("//form[@id='register-form']//div[@class='text-danger form-group']"));
        //By.xpath("//*[@class=\"invalid-feedback\"]")


        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//*[@class=\"invalid-feedback\"]"));
        System.out.println(elements);
        System.out.println("Number of elements:" +elements.size());
        for (int i=0; i<elements.size();i++){
            System.out.println("Error empty field message:" + elements.get(i).getText());
        }
        Assert.assertTrue("All fields are not required ", elements.size() == 9);
//        for (int i=0; i<registrationPage.elements.size();i++){
//            System.out.println("Error empty field message:" + registrationPage.elements.get(i).getText());
//        }
//        Assert.assertTrue(registrationPage.errorMessage_invalid.isDisplayed());
    }

    @Then("user sees error message as ssnEmpty")
    public void userSeesErrorMessageAsSsnEmpty() {
        Assert.assertTrue(registrationPage.emptySSN.isDisplayed());
    }

    @Then("user sees error message as firstNameEmpty")
    public void userSeesErrorMessageAsFirstNameEmpty() {
        Assert.assertTrue(registrationPage.emptyFirstname.isDisplayed());
    }

    @Then("user sees error message as lastNameEmpty")
    public void userSeesErrorMessageAsLastNameEmpty() {
        Assert.assertTrue(registrationPage.emptyLastname.isDisplayed());
    }

    @Then("user sees error message as addressEmpty")
    public void userSeesErrorMessageAsAddressEmpty() {
        //Driver.waitForVisibility(registrationPage.emptyAddress, 5);
        //Driver.verifyElementNotDisplayed(By.xpath("//*[text()='Your Address is required']"));
        Driver.verifyElementDisplayed(registrationPage.emptyAddress);
    }

    @Then("user sees error message as mobilephoneEmpty")
    public void userSeesErrorMessageAsMobilephoneEmpty() {
        //Driver.waitForVisibility(registrationPage.mobilephoneEmpty, 5);
        //Driver.verifyElementNotDisplayed(By.xpath("//*[text()='YourMobile Phone Number is required']"));
        //Assert.assertTrue(registrationPage.mobilephoneEmpty.isDisplayed());
    }

    @Then("user sees error message as usernameEmpty")
    public void userSeesErrorMessageAsUsernameEmpty() {
        Assert.assertTrue(registrationPage.usernameEmpty.isDisplayed());
    }

    @Then("user sees error message as emailEmpty")
    public void userSeesErrorMessageAsEmailEmpty() {
        Assert.assertTrue(registrationPage.emailEmpty.isDisplayed());
    }

    @Then("user sees error message as firstPasswordEmpty")
    public void userSeesErrorMessageAsFirstPasswordEmpty() {
        Assert.assertTrue(registrationPage.firstPasswordEmpty.isDisplayed());
    }

    @Then("user sees error message as secondPasswordEmpty")
    public void userSeesErrorMessageAsSecondPasswordEmpty() {
        Assert.assertTrue(registrationPage.secondPasswordEmpty.isDisplayed());

    }


    @When("user enters ssn number as  {string} and presses enter")
    public void userEntersSsnNumberAsAndPressesEnter(String string) {
        registrationPage.ssnTextBox.sendKeys(string);
        registrationPage.ssnTextBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees error message as ssnInvalid")
    public void userSeesErrorMessageAsSsnInvalid() {
        Assert.assertTrue(registrationPage.ssninvalid.isDisplayed());
    }

    @When("user enters firstname as {string} and presses enter")
    public void userEntersFirstnameAsAndPressesEnter(String string) {
        registrationPage.firstNameTextBox.sendKeys(string);
        registrationPage.firstNameTextBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees error message as FirstNameInvalid")
    public void userSeesErrorMessageAsFirstNameInvalid() {
        Driver.verifyElementDisplayed(registrationPage.firstNameInvalid);
        Assert.assertTrue(registrationPage.firstNameInvalid.isDisplayed());
    }

    @When("user enters lastname as {string} and presses enter")
    public void userEntersLastnameAsAndPressesEnter(String string) {
        registrationPage.lastNameTextBox.sendKeys(string);
        registrationPage.lastNameTextBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees error message as LastNameInvalid")
    public void userSeesErrorMessageAsLastNameInvalid() {
        Assert.assertTrue(registrationPage.lastNameInvalid.isDisplayed());
    }

    @When("user provides address as {string} and presses enter")
    public void userProvidesAddressAsAndPressesEnter(String string) {
        registrationPage.addressTextBox.sendKeys(string);
        registrationPage.addressTextBox.sendKeys(Keys.ENTER);
    }

//    @Then("user sees error message as addressInvalid")
//    public void userSeesErrorMessageAsAddressInvalid() {
//        Assert.assertTrue(registrationPage.addressinvalid.isDisplayed());
//    }

    @When("user provides mobilephone as {string} and presses enter")
    public void userProvidesMobilephoneAsAndPressesEnter(String string) {
        registrationPage.mobilephoneTextBox.sendKeys(string);
        registrationPage.mobilephoneTextBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees error message as  mobilephoneInvalid")
    public void userSeesErrorMessageAsMobilephoneInvalid() {
        Assert.assertTrue(registrationPage.mobilephoneInvalid.isDisplayed());
    }

    @When("user provides a username as {string} and presses enter")
    public void userProvidesAUsernameAsAndPressesEnter(String string) {
        registrationPage.usernameTextBox.sendKeys(string);
        registrationPage.usernameTextBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees error message as usernameInvalid")
    public void userSeesErrorMessageAsUsernameInvalid() {
        Assert.assertTrue(registrationPage.usernameInvalid.isDisplayed());
    }

    @When("user provides email id as {string} and presses enter")
    public void userProvidesEmailIdAsAndPressesEnter(String string) {
        registrationPage.emailTextBox.sendKeys(string);
        registrationPage.emailTextBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees error message as emailInvalid")
    public void userSeesErrorMessageAsEmailInvalid() {

        Assert.assertTrue(registrationPage.emailInvalid.isDisplayed());
    }

    @Then("user sees error message as emailAtLeastFiveChar")
    public void userSeesErrorMessageAsEmailAtLeastFiveChar() {
        Assert.assertTrue(registrationPage.emailAtLeastFiveChar.isDisplayed());
    }


}
