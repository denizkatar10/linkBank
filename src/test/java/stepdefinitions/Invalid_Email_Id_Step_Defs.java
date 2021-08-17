package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Invalid_Email_Id_Step_Defs {
    HomePage homePage = new HomePage();
    HomePage accountdropdown = new HomePage();
    SignInPage signInPage = new SignInPage();
    HomePage emailButton = new HomePage();

    @Given("user on the home page")
    public void user_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
    }


    @Then("click account dropdown")
    public void click_account_dropdown(){
        homePage.accountdropdown.click();
        homePage.signin.click();

    }

    @Given("user on the signin  page")
    public void user_on_the_signin_page() {
      //  signInPage.usernametext.sendKeys(ConfigurationReader.getProperty("customer_username"));
        signInPage.signinbutton.click();
    }

    @Given("customer enters username")
    public void customer_enters_username() {
        signInPage.usernametext.sendKeys(ConfigurationReader.getProperty("customer_username"));
    }
    @Given("customer enters password")
    public void customer_enters_password() {
        signInPage.passwordtext.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }
    @Given("click sign in")
    public void click_sign_in() {
        signInPage.signinbutton.click();
    }

    @Then("click email button")
    public void click_email_button() {
        homePage.emailButton.click();

    }
    }






