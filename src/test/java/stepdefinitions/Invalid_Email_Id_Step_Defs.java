package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.ro.Si;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.SignInPage;
import pages.UserInfoPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.TimeoutException;

public class Invalid_Email_Id_Step_Defs {
    HomePage homePage = new HomePage();
    //HomePage accountdropdown = new HomePage();
    SignInPage signInPage = new SignInPage();
    // SignInPage signinbutton = new SignInPage();
    // HomePage emailButton = new HomePage();
    UserInfoPage userInfoPage = new UserInfoPage();
    Faker faker = new Faker();

    @Given("user on the home page")
    public void user_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
    }

    @Then("click account dropdown")
    public void click_account_dropdown() {
        homePage.accountdropdown.click();
        homePage.signin.click();
    }

    @Given("user on the signin  page")
    public void user_on_the_signin_page() {
        // signInPage.usernametext.sendKeys(ConfigurationReader.getProperty("customer_username"));
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
        Driver.waitAndClick(signInPage.signinbutton, 10);
    }

    @And("click user dropdown")
    public void click_User_Dropdown() {
       userInfoPage.useriddrop.click();

    }

    @Then("customer click user info")
    public void customer_click_user_Info() {
      userInfoPage.userinfo.click();

    }

    @Then("click email button")
    public void click_email_button() {
        userInfoPage.emailTextBox.click();
        userInfoPage.emailTextBox.clear();

    }

    @And("user enters email id {string}")
    public void useEntersEmailId(String string) {
        userInfoPage.emailTextBox.sendKeys(string);
    }

    @Then("verify system does not accept invalid email address")
    public void verify_System_Does_Not_Accept_Invalid_Email_Address() {
        String invalid = userInfoPage.invalidEmail.getText();
        Assert.assertEquals("This field is invalid", invalid);
    }


    @Given("customer clicks language textbox")
    public void customerClicksLanguageTextbox() {
        userInfoPage.languageButton.click();

    }

    @Then("customer sees English option")
    public void customerSeesOnlyEnglishAndTurkishOptions() {
        ReusableMethods.waitForVisibility(userInfoPage.english, 5);
        Assert.assertTrue(userInfoPage.english.isDisplayed());
    }

    @Then("customer sees Turkish options")
    public void customerSeesTurkishOptions() {
        ReusableMethods.waitForVisibility(userInfoPage.turkish, 5);
        Assert.assertTrue(userInfoPage.turkish.isDisplayed());
    }
}
















