package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CustomerAccounts {
    public CustomerAccounts(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement Account1Type;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    public WebElement Account1Balance;

    @FindBy(xpath = "//tbody//tr[2]//td[2]")
    public WebElement Account2Type;

    @FindBy(xpath = "//tbody//tr[2]//td[3]")
    public WebElement Account2Balance;

    @FindBy(xpath = "//tbody//tr[1]//td[4]//button")
    public WebElement TransactionButton1;

    @FindBy(xpath = "//tbody//tr[2]//td[4]//button")
    public WebElement TransactionButton2;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[1]")
    public WebElement TransactionID;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[2]")
    public WebElement TransactionAccountID;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[3]")
    public WebElement TransactionDescription;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[4]")
    public WebElement TransactionDate;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[5]")
    public WebElement TransactionAmount;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[6]")
    public WebElement TransactionNewBalance;

    @FindBy(xpath = "//*[text()='Team52 Checking']")
    public WebElement Team52Checking;

    @FindBy(xpath = "//*[text()='Team52 Saving']\n")
    public WebElement Team52Saving;

}
