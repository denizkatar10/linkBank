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


}
