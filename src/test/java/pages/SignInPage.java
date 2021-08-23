package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {
    public SignInPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="username")
    public WebElement usernametext;

    @FindBy(id="password")
    public WebElement passwordtext;

    @FindBy(xpath = "(//button[@type='submit'])")
    public WebElement signinbutton;

    @FindBy(xpath = "(//*[@class='btn btn-secondary'])")
    public WebElement cancelbutton;

    @FindBy(xpath = "//*[text()='Failed to sign in!']")
    public WebElement failedToSignIn;

    @FindBy(xpath = "//a[@href='/account/reset/request']")
    public WebElement forgetPasswordLink;

    @FindBy(xpath = "(//a[@href='/account/register'])[2]")
    public WebElement registerNewAccount;


}
