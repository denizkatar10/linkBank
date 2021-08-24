package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

 }
