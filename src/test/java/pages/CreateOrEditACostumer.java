package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditACostumer {
    public CreateOrEditACostumer(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "search-ssn")
    public WebElement ssntextbox;

    @FindBy(xpath = "//*[contains(text(),'Search')]")
    public WebElement searchbutton;

    @FindBy(xpath = "//*[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement successpopup;

    @FindBy(xpath = "//*[@class='Toastify__close-button Toastify__close-button--error']")
    public WebElement errorpopup;

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement verifyMessageAddress;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[9]")
    public WebElement verifyMessageCity;

}
