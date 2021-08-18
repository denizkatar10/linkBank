package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;

public class CommonPageElemnets {

    public CommonPageElemnets(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dropdown show nav-item']")
    public WebElement userDropdown;

    @FindBy(xpath = "//*[text()='User Info']")
    public WebElement userInfoSegment;
}
