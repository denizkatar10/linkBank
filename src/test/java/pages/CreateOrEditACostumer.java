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
}
