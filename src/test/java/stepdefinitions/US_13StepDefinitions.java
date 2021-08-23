package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_13Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_13StepDefinitions {
    US_13Page us_13Page= new US_13Page();

//TC01
    @Given("Kullanici gmibank anasayfaya gider")
    public void kullanici_gmibank_anasayfaya_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));

    }
    @Given("Giris simgesine tiklar")
    public void giris_simgesine_tiklar() {
        us_13Page.girisButton.click();
        us_13Page.signInGirisButon.click();
    }
    @Given("Gecerli username ve password girer")
    public void gecerli_username_ve_password_girer() {

        us_13Page.username.sendKeys(ConfigurationReader.getProperty("employee_username"));
        us_13Page.password.sendKeys(ConfigurationReader.getProperty("employee_password"));

    }
    @Given("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        us_13Page.signInButton.click();

    }
    @Given("My Operation tiklar")
    public void my_operation_tiklar() {
        us_13Page.myOperations.click();

    }
    @Given("Manage Accounts tiklar")
    public void manage_accounts_tiklar() {
        us_13Page.manageAccount.click();

    }
    @Given("+Create a new Account tiklar")
    public void create_a_new_account_tiklar() {
        us_13Page.createAccountButton.click();
    }
    @Given("Create or edit a Account yazisini gorur")
    public void create_or_edit_a_account_yazisini_gorur() {
        Assert.assertTrue(us_13Page.creaateOrEditACustomerYazisi.isDisplayed());

    }


    //TC02
    @Given("kullanici Description texbos acıklama yapmalıdır")
    public void kullaniciDescriptionTexbosAcıklamaYapmalıdır() {
        us_13Page.descriptionTextBox.click();
        us_13Page.descriptionTextBox.sendKeys(ConfigurationReader.getProperty("descriptionTextBox"));

    }
    @And("kullanici Balance texbos fiyat  girmelidir")
    public void kullaniciBalanceTexbosFiyatGirmelidir() {
        us_13Page.balanceTextBox.click();
        us_13Page.balanceTextBox.sendKeys(ConfigurationReader.getProperty("balanceTextBox"));

    }
    @And("kullanici Account Type CHECKING girmelidir")
    public void kullaniciAccountTypeCHECKINGGirmelidir(){
        us_13Page.acountTypesecim.click();
        us_13Page.acountTypesecim1.click();

    }
    @And("kullanici Account Status Type ACTIVE girmelidir")
    public void kullaniciAccountStatusTypeACTIVEGirmelidir() {
        us_13Page.acountStatusTypesecim.click();
        us_13Page.acountStatusTypesecim1.click();
    }

    @And("kullanici Create Date girmeli")
    public void kullaniciCreateDateGirmeli() {
        us_13Page.createDateTextBox.click();
        us_13Page.createDateTextBox.sendKeys("20-05-2020 00:0");


    }

    @And("kullanici Closed Date girmelidir")
    public void kullaniciClosedDateGirmelidir() {
        us_13Page.closedDateTextBox.click();
        us_13Page.closedDateTextBox.sendKeys("12-05-2021 00:00");

    }

    @And("kullanici Employee tıklamalıdr")
    public void kullaniciEmployeeTıklamalıdr() {
        us_13Page.employee.click();

    }

    @And("kullanici Save butonuna tıklamalıdır")
    public void kullaniciSaveButonunaTıklamalıdır() {
        us_13Page.saveButton.click();
    }

    @And("kullanici Account Type SAVING girmelidir")
    public void kullaniciAccountTypeSAVINGGirmelidir() {
        us_13Page.acountTypesecim.click();
        us_13Page.acountTypesecim2.click();

    }

    @And("kullanici Account Status Type SUESPENDED girmelidir")
    public void kullaniciAccountStatusTypeSUESPENDEDGirmelidir() {
        us_13Page.acountStatusTypesecim.click();
        us_13Page.acountStatusTypesecim2.click();
    }

    @And("kullanici Account Type CREDIT_CARD girmelidir")
    public void kullaniciAccountTypeCREDIT_CARDGirmelidir() {
        us_13Page.acountTypesecim.click();
        us_13Page.acountTypesecim3.click();

    }

    @And("kullanici Account Status Type CLOSED girmelidir")
    public void kullaniciAccountStatusTypeCLOSEDGirmelidir() {
        us_13Page.acountStatusTypesecim.click();
        us_13Page.acountStatusTypesecim3.click();

    }

    @And("kullanici Account Type INVESTING girmelidir")
    public void kullaniciAccountTypeINVESTINGGirmelidir() {
        us_13Page.acountTypesecim.click();
        us_13Page.acountTypesecim4.click();
    }

    @And("sayfa kapanır")
    public void sayfaKapanır() {
        Driver.closeDriver();
    }
}

