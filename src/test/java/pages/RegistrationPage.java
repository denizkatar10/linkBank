package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class RegistrationPage {

    public RegistrationPage(){
        initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(id = "firstname")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastname")
    public WebElement lastNameTextBox;

    @FindBy(id = "address")
    public WebElement addressTextBox;

    @FindBy(id = "mobilephone")
    public WebElement mobilephoneTextBox;

    @FindBy(id = "username")
    public WebElement usernameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextBox;

    //////////////////////////////////////////////////////////////////

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/span")
    public WebElement succesfulRegisterMessage;

    //////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//*[@id=\"register-form\"]/div[1]/div")
    public WebElement ssninvalid;

    //////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement errorSsnExists;


}
