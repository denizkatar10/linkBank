package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CreateOrEditACostumer;

public class US_010_AddressOfCustomerCanBeCreated {
    CreateOrEditACostumer createOrEditACostumer = new CreateOrEditACostumer();
    Faker faker = new Faker();
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
}
