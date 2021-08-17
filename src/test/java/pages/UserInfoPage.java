package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserInfoPage {
    public UserInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(className = "invalid-feedback")
        public WebElement invalidEmail;

}
