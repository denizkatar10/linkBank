package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_13Page {
    public US_13Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisButton;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInGirisButon;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath = "//a[@id='jh-create-entity']")
    public WebElement createAccountButton;

    @FindBy (xpath = "//span[contains(text(),'Create or edit a Account')]")
    public WebElement creaateOrEditACustomerYazisi;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement descriptionTextBox;

    @FindBy (xpath = "//input[@name='balance']")
    public WebElement balanceTextBox;


    @FindBy (xpath = "//*[@id='tp-account-accountType']")
    public WebElement acountTypesecim;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[1]")
    public WebElement acountTypesecim1;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[2]")
    public WebElement acountTypesecim2;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[3]")
    public WebElement acountTypesecim3;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[4]")
    public WebElement acountTypesecim4;

    @FindBy (xpath = "//*[@id='tp-account-accountStatusType']")
    public WebElement acountStatusTypesecim;
    @FindBy (xpath = "//*[@id='tp-account-accountStatusType']/option[1]")
    public WebElement acountStatusTypesecim1;
    @FindBy (xpath = "//*[@id='tp-account-accountStatusType']/option[2]")
    public WebElement acountStatusTypesecim2;
    @FindBy (xpath = "//*[@id='tp-account-accountStatusType']/option[3]")
    public WebElement acountStatusTypesecim3;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDateTextBox;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDateTextBox;


    @FindBy (id = "tp-account-employee")
    public WebElement employee;

    @FindBy (id = "save-entity")
    public WebElement saveButton;


    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//a[@href='/tp-account']")
    public WebElement manageAccount;


}