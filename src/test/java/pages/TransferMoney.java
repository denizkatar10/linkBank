package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TransferMoney {

    public TransferMoney(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement FromAccount;

    @FindBy(xpath = "//*[@id=\"fromAccountId\"]/option[2]")
    public WebElement FromAccountFirst;

    @FindBy(xpath = "//*[@id=\"toAccountId\"]/option[2]")
    public WebElement ToAccountSecond;

    @FindBy(id="toAccountId")
    public WebElement ToAccount;

    @FindBy(id="balance")
    public WebElement BalanceDollars;

    @FindBy(id="balancecent")
    public WebElement BalanceCents;

    @FindBy(id="description")
    public WebElement description;

    @FindBy(id="make-transfer")
    public WebElement MakeTransferButton;

    @FindBy(xpath = "//*[text()='Transfer is succesfull']")
    public WebElement successMessage;


}
