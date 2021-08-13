package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GmiStepDefenitions {
    @Given("user on the gmi Home page")
    public void userOnTheGmiHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_qa_url"));
    }

}
