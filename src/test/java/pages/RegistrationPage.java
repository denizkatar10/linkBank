package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="register-title")
    public WebElement registerTitle;

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

    ////////////////////////////////////////////////////////////////

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement succesfulRegisterMessage;

    //////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//*[text()='Your SSN is invalid']")
    public WebElement ssninvalid;

    @FindBy(xpath = "//*[text()='first name is invalid']")
    public  WebElement firstNameInvalid;

    @FindBy(xpath = "//*[text()='Your last name is invalid']")
    public  WebElement lastNameInvalid;

//    @FindBy()
//    public WebElement addressinvalid;

    @FindBy(xpath = "//*[text()='Your mobile phone number is invalid']")
    public WebElement mobilephoneInvalid;

    @FindBy(xpath = "//*[text()='Your username is invalid']")
    public WebElement usernameInvalid;

    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement emailInvalid;

    @FindBy(xpath = "//*[text()='Your email is required to be at least 5 characters.']")
    public WebElement emailAtLeastFiveChar;

    //////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//*[text()='translation-not-found[error.ssnexists]']")
    public WebElement errorSsnExists;

    ///////////////////////////////////////////////////

    @FindBy(xpath = "//*[text()='translation-not-found[Your SSN is required]']")
    public WebElement emptySSN;

    @FindBy(xpath = "//*[text()='Your First Name is required']")
    public WebElement emptyFirstname;

    @FindBy(xpath = "//*[text()='Your Last Name is required']")
    public WebElement emptyLastname;

    @FindBy(xpath = "//*[text()='Your Address is required']")
    public WebElement emptyAddress;

    @FindBy(xpath = "//*[text()='YourMobile Phone Number is required']")
    public WebElement mobilephoneEmpty;

    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement usernameEmpty;

    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement emailEmpty;

    @FindBy(xpath = "//*[text()='Your password is required.']")
    public WebElement firstPasswordEmpty;

    @FindBy(xpath = "//*[text()='Your confirmation password is required.']")
    public WebElement secondPasswordEmpty;

}
