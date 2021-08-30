package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CreateOrEditACostumer;
import pages.CustomerAccounts;
import pages.ManageCustomers;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class US_010_AddressOfCustomerCanBeCreated {
    CreateOrEditACostumer createOrEditACostumer = new CreateOrEditACostumer();
    Faker faker = new Faker();
    ManageCustomers manageCustomers = new ManageCustomers();
    CustomerAccounts customerAccounts = new CustomerAccounts();

    @Given("click save button")
    public void clickSaveButton() {
        createOrEditACostumer.savebutton.click();
    }

    @And("verify address box require message")
    public void verifyAddressBoxRequireMessage() {
        Assert.assertEquals("This field is required.",createOrEditACostumer.verifyMessageAddress.getText());
    }

    @And("send a address to address box")
    public void sendAAddressToAddressBox() {
        createOrEditACostumer.addressbox.sendKeys(faker.address().streetAddress());
    }

    @And("verify city box require message")
    public void verifyCityBoxRequireMessage() {
        Assert.assertEquals("This field is required.",createOrEditACostumer.verifyMessageCity.getText());
    }

    @And("send a city name to city box")
    public void sendACityNameToCityBox() {
        createOrEditACostumer.citybox.sendKeys(faker.address().city());
        createOrEditACostumer.ssntextbox.sendKeys(faker.idNumber().ssnValid());
    }

    @Given("select county from dropdown")
    public void selectCountyFromDropdown() {
        Select select = new Select(createOrEditACostumer.countydropbox);
        select.selectByVisibleText("USA");
    }

    @Given("send state name to state box")
    public void sendStateNameToStateBox() {
        createOrEditACostumer.statebox.sendKeys(faker.address().state());
    }

    @And("user fills the required areas")
    public void userFillsTheRequiredAreas() {
       manageCustomers.MiddleInitialBox.sendKeys("O");
       manageCustomers.PhoneNumberBox.sendKeys("567-789-4567");
       manageCustomers.ZipCodeBox.sendKeys("278456");
       manageCustomers.CityBox.sendKeys("Tokyo");
        ReusableMethods.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
       Select country = new Select(manageCustomers.countryDropdown);
        country.selectByVisibleText("USA");
        manageCustomers.StateBox.sendKeys("New York");
        ReusableMethods.waitFor(2);
        actions.click(customerAccounts.Team52Checking).keyDown(Keys.LEFT_CONTROL).click(customerAccounts.Team52Saving).keyUp(Keys.LEFT_CONTROL).perform();
        ReusableMethods.waitFor(3);
        manageCustomers.SaveBox.click();
        ReusableMethods.waitFor(3);

        }
}
