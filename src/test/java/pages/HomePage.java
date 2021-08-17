package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="account-menu")
    public WebElement accountdropdown;

    @FindBy(id="login-item")
    public WebElement signin;

    @FindBy(xpath="(//a[@class='dropdown-item'][2])")
    public WebElement register;

    @FindBy(id="email")
    public WebElement emailButton;

}
