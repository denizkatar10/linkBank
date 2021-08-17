package stepdefinitions;

import io.cucumber.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009_NewApplicantSearchWithSSN {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    ControlPage controlPage = new ControlPage();
    CreateOrEditACostumer createOrEditACostumer = new CreateOrEditACostumer();
    ManageCustomers manageCustomers = new ManageCustomers();

    @Given("user on the application page")
    public void user_on_the_application_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
    }
    @Given("click login button")
    public void click_login_button() {
        homePage.accountdropdown.click();
        homePage.signin.click();

    }
    @Given("manager enters username")
    public void manager_enters_username() {
        signInPage.usernametext.sendKeys(ConfigurationReader.getProperty("manager_username"));
    }
    @Given("manager enters password")
    public void manager_enters_password() {
        signInPage.passwordtext.sendKeys(ConfigurationReader.getProperty("manager_password"));
    }
    @Given("click sign in button")
    public void click_sign_in_button() {
        signInPage.signinbutton.click();
    }
    @Given("click My Operations")
    public void click_my_operations() {
        controlPage.myoperations.click();
    }
    @Given("click Manage Customers")
    public void click_manage_customers() {
        controlPage.managecustomers.click();
    }
    @Given("click Create a new Customer")
    public void click_create_a_new_customer() {
        manageCustomers.createanewcustomer.click();
    }
    @Given("write a customer SSN")
    public void write_a_customer_SSN() {
        createOrEditACostumer.ssntextbox.sendKeys(ConfigurationReader.getProperty("customer_ssn"));
    }
    @Given("click Search button")
    public void click_search_button() {
        createOrEditACostumer.searchbutton.click();
    }
    @Given("check green success popup")
    public void check_green_success_popup() {
        createOrEditACostumer.successpopup.isDisplayed();
        //Assert.assertEquals("Deniz",createOrEditACostumer.firstname.getAttribute("value"));

    }




}
