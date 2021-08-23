package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.UserInfoPage;
import utilities.ReusableMethods;

public class us_006_UserSettingsStep {

    UserInfoPage userInfoPage = new UserInfoPage();

    @Then("customer sees user settings page populated with info {string}, {string}, {string} and {string}")
    public void customerSeesUserSettingsPagePopulatedWithInfoAnd(String firstName, String lastName, String email, String language) {
        Assert.assertEquals(firstName, userInfoPage.firstName.getAttribute("value"));
        Assert.assertEquals(lastName, userInfoPage.lastName.getAttribute("value"));
        Assert.assertEquals(email, userInfoPage.emailTextBox.getAttribute("value"));
        Assert.assertTrue(userInfoPage.languageButton.isDisplayed());

//        Assert.assertTrue(userInfoPage.firstName.isDisplayed());
//        Assert.assertTrue(userInfoPage.lastName.isDisplayed());
//        Assert.assertTrue(userInfoPage.emailTextBox.isDisplayed());
//        Assert.assertTrue(userInfoPage.languageButton.isDisplayed());
    }

    @Given("customer clicks firstName textbox, clears it, and types another {string}")
    public void customerClicksFirstNameTextboxClearsItAndTypesAnother(String string) {
        userInfoPage.firstName.clear();
        userInfoPage.firstName.sendKeys(string);
    }

    @And("customer clicks Save button")
    public void customerClicksSaveButton() {
        userInfoPage.saveButton.click();

    }

    @Then("customer sees settings saved message")
    public void customerSeesSettingsSavedMessage() {
        ReusableMethods.waitForVisibility(userInfoPage.settingsSavedMessage,2);
        Assert.assertTrue(userInfoPage.settingsSavedMessage.isDisplayed());
    }

    @Given("customer clicks lastName textbox, clears it, and types another {string}")
    public void customerClicksLastNameTextboxClearsItAndTypesAnother(String string) {
        userInfoPage.lastName.clear();
        userInfoPage.lastName.sendKeys(string);
    }

    @Given("customer clicks email textbox, clears it, and types another {string}")
    public void customerClicksEmailTextboxClearsItAndTypesAnother(String string) {
        userInfoPage.emailTextBox.clear();
        userInfoPage.emailTextBox.sendKeys(string);
    }

    @Then("customer selects Turkish language")
    public void customerSelectsTurkishLanguage() {
        userInfoPage.languageButton.click();
        userInfoPage.turkish.click();
    }
}
