package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserInfoPage {
    public UserInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='User Info']")
    public WebElement userInfo;

    @FindBy(xpath = "//*[@class='dropdown show nav-item']")
    public WebElement userDropDown;

    @FindBy(xpath = "//*[text()='Deniz Csutomer']")
    public WebElement accountNameDropDown;

//    @FindBy(xpath = "//*[text()='Email']")
//    public WebElement emailButton;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement invalidEmail;

    @FindBy(id = "langKey")
    public WebElement languageButton;

    @FindBy(xpath = "//*[@id=\"langKey\"]/option[1]")
    public WebElement english;

    @FindBy(xpath = "//*[@id=\"langKey\"]/option[2]")
    public WebElement turkish;

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement useriddrop;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement userinfo;

}
