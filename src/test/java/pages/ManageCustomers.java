package pages;

import org.jsoup.select.Evaluator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.openqa.selenium.support.How.ID;

public class ManageCustomers {
    public ManageCustomers(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createanewcustomer;

    @FindBy(xpath = "//*[text()='Internal server error.']")
    public WebElement SubmissionErrorMessage;

    @FindBy(css = "input#tp-account-createDate")
    public WebElement createDateTextBox;

    @FindBy(css = "input#tp-account-closedDate")
    public WebElement closedDateTextBox;

    @FindBy(css = ".text-danger.form-group:nth-child(5)")
    public WebElement createDateErrorFormat;

    @FindBy(css = ".text-danger.form-group:nth-child(5)")
    public WebElement closedDateErrorFormat;

    @FindBy(css = ".dropdown-item:nth-child(1)")
    public WebElement manageCustomerButton;

    @FindBy(css = "#jh-create-entity")
    public WebElement createCustomerButton;

    @FindBy(css = "#search-ssn")
    public WebElement ssnSearch;

    @FindBy(css = ".btn.btn-secondary")
    public WebElement searchButtonForSnn;

    @FindBy(css = "#tp-customer-firstName")
    public WebElement firstNameAfterSearch;

    @FindBy(xpath = "//*[text()='Create Date']")
    public WebElement CreateDateTxt;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement IDTxt;

    @FindBy(xpath = "//*[text()='First Name']")
    public WebElement FirstNameTxt;

    @FindBy(xpath = "//*[text()='Last Name']")
    public WebElement LastNameTxt;

    @FindBy(xpath = "//*[text()='Middle Initial']")
    public WebElement MiddleInitialTxt;

    @FindBy(xpath = "//*[text()='Email']")
    public WebElement EmailTxt;

    @FindBy(xpath = "//*[text()='Mobile Phone Number']")
    public WebElement MobilePhoneNumberTxt;

    @FindBy(xpath = "//*[text()='Phone Number']")
    public WebElement PhoneNumberTxt;

    @FindBy(xpath = "//*[text()='Address']")
    public WebElement AddressTxt;

    @FindBy(xpath = "//*[text()='View']")
    public WebElement ViewTxt;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement EditTxt;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement DeleteTxt;

    @FindBy(xpath = "//span[text()='Are you sure you want to delete Customer 1719?']")
    public WebElement CostumerDeleteTxt;

    @FindBy(xpath = "//*[text()='Zip Code']")
    public WebElement ZipCodeTxt;

    @FindBy(xpath = "//*[text()='City']")
    public WebElement CityTxt;

    @FindBy(xpath = "//*[text()='Ssn']")
    public WebElement SsnTxt;

    @FindBy(xpath = "//*[text()='Zelle Enrolled']")
    public WebElement ZelleEnrolledTxt;

    @FindBy(xpath = "//*[text()='Country']")
    public WebElement CountryTxt;

    @FindBy(xpath = "//*[text()='State']")
    public WebElement StateTxt;

    @FindBy(xpath = "//*[text()='User']")
    public WebElement UserTxt;

    @FindBy(xpath = "//*[text()='Account']")
    public WebElement AccountTxt;

    @FindBy(xpath = "//input[@id='tp-customer-firstName']")
    public WebElement FirstNameBox;

    @FindBy(xpath = "//input[@id='tp-customer-lastName']")
    public WebElement LastNameBox;

    @FindBy(xpath = "//input[@id='tp-customer-middleInitial']")
    public WebElement MiddleInitialBox;

    @FindBy(xpath = "//input[@id='tp-customer-email']")
    public WebElement EmailBox;

    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement MobilePhoneNumberBox;

    @FindBy(xpath = "//input[@id='tp-customer-phoneNumber']")
    public WebElement PhoneNumberBox;

    @FindBy(xpath = "//input[@id='tp-customer-zipCode']")
    public WebElement ZipCodeBox;

    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public WebElement AddressBox;

    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement CityBox;

    @FindBy(xpath = "//input[@id='tp-customer-ssn']")
    public WebElement SsnBox;

    @FindBy(xpath = "//input[@id='tp-customer-createDate']")
    public WebElement CreateDateBox;

    @FindBy(xpath = "//input[@id='tp-customer-country']")
    public WebElement CountryBox;

    @FindBy(xpath = "//input[@id='tp-customer-state']")
    public WebElement StateBox;

    @FindBy(xpath = "//input[@id='tp-customer-user']")
    public WebElement UserBox;

    @FindBy(xpath = "//input[@id='tp-customer-account']")
    public WebElement AccountBox;

    @FindBy(xpath = "//input[@id='tp-customer-zelleEnrolled']")
    public WebElement ZelleEnrolledBox;


    @FindBy(xpath = "(//*[text()='Save'])[3]")
    public WebElement SaveBox;

    @FindBy(xpath = "(//select)[1]")
    public WebElement countryDropdown;
}


