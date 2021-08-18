package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage(){PageFactory.initElements(Driver.getDriver(), this);}

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

    //////////////////////////////////////////////////////////////////

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement succesfulRegisterMessage;

    //////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//*[text()='Your SSN is invalid']")
    public WebElement ssninvalid;

    @FindBy()
    public  WebElement FirstNameInvalid;


    //is-touched is-dirty av-valid form-control
    //is-touched is-pristine av-invalid is-invalid form-control
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

    @FindBy(id = "lastname", className = "is-touched is-pristine av-invalid is-invalid form-control")
    public WebElement emptyAddress;

    @FindBy()
    public WebElement usernameEmpty;

    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement emailEmpty;

    @FindBy(xpath = "//*[text()='Your password is required.']")
    public WebElement firstPasswordEmpty;

    @FindBy(xpath = "//*[text()='Your confirmation password is required.']")
    public WebElement secondPasswordEmpty;

}



//*[@id="register-form"]/div[1]/div