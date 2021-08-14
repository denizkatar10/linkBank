package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ControlPage {
    public ControlPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),'My Operations')]")
    public WebElement myoperations;

    @FindBy(xpath = "//*[contains(text(),'Manage Customers')]")
    public WebElement managecustomers;

    @FindBy(xpath = "//*[contains(text(),'Manage Accounts')]")
    public WebElement manageaccounts;
}
