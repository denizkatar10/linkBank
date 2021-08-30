package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_17Page {

    public US_17Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement insanFiguru;

    @FindBy(linkText = "Sign in")
    public WebElement signYazisi;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement account;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[10]")
    public WebElement signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernametextbox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordtextbox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButonu;

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
    public WebElement administration;

    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagement ;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]")
    public WebElement editButonu;

//    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
//    public WebElement edittext;

    @FindBy(xpath = "//span[text()='Create or edit a user']")
    public WebElement edittext;

    @FindBy(xpath = "(//select)[2]")
    public WebElement profiles;

    @FindBy(xpath = "//option[@value='ROLE_ADMIN']")
    public WebElement admin;

    @FindBy(xpath = "//*[@id=\"authorities\"]/option[2]")
    public WebElement user;

    @FindBy(xpath = "//*[@id=\"authorities\"]/option[3] ")
    public WebElement employee;

    @FindBy(xpath = "//option[@value='ROLE_MANAGER']")
    public WebElement manager;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement save;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement allert;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement view;

    @FindBy(xpath = "//span[text()='User']")
    public WebElement viewTex;
    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement back;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[3]")
    public WebElement delete;

    @FindBy(xpath = "(//button[@type='button'])[24]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement silindiMesaji;

    @FindBy(xpath = "//span[contains(text(),'Created date')]")
    public WebElement creatDate;
}