package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_17Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class us17Step {

    US_17Page us_17page= new US_17Page();

    @And("kullanici insan figurune tiklar")
    public void kullaniciInsanFiguruneTiklar() {
        us_17page.insanFiguru.click();
        ReusableMethods.waitFor(2);
    }

    @And("kullanici sign_in sekmesine tiklar")
    public void kullaniciSign_inSekmesineTiklar() {
        us_17page.signYazisi.click();
        ReusableMethods.waitFor(2);
    }

    @And("kullanici gecerli username girer")
    public void kullaniciGecerliUsernameGirer() {
        us_17page.usernametextbox.sendKeys(ConfigurationReader.getProperty("admin_username"));
        ReusableMethods.waitFor(2);

    }

    @And("kullanici gecerli password girer")
    public void kullaniciGecerliPasswordGirer() {
        us_17page.passwordtextbox.sendKeys(ConfigurationReader.getProperty("admin_password"));
        ReusableMethods.waitFor(2);
    }

    @And("sign_in ile giris yapar")
    public void sign_inIleGirisYapar() {
        us_17page.signInButonu.click();
        ReusableMethods.waitFor(2);
    }

    @And("Administration bolumune tiklar")
    public void administrationBolumuneTiklar() throws InterruptedException {
        us_17page.administration.click();
        Thread.sleep(5000);
    }

    @And("userManagementa tiklar")
    public void usermanagementaTiklar() throws InterruptedException {
        us_17page.userManagement.click();
        Thread.sleep(3000);
    }

    @Then("kullanici edit sekmesine tiklar")
    public void kullaniciEditSekmesineTiklar() throws InterruptedException {
        us_17page.editButonu.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
    }

    @And("admin profilesden {string} secer ve save eder")
    public void adminProfilesdenSecerVeSaveEder(String role) throws InterruptedException {
        Select select = new Select(us_17page.profiles);
        select.deselectAll();
        select.selectByValue(role);
        //us0017Page.profiles.click();
        Thread.sleep(3000);
        us_17page.save.click();
        Thread.sleep(3000);
        Assert.assertTrue(us_17page.allert.isDisplayed());
    }



    @Then("kullanici view sekmesine tiklar")
    public void kullaniciViewSekmesineTiklar() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(3000);
        us_17page.view.click();
    }

    @And("secilen kisinin goruntuleme islemini dogrular")
    public void secilenKisininGoruntulemeIsleminiDogrular() {
        Assert.assertTrue(us_17page.viewTex.isDisplayed());
        us_17page.back.click();
    }

    @And("secilen kisinin duzenlenebildigini dogrular")
    public void secilenKisininDuzenlenebildiginiDogrular() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(us_17page.edittext.isDisplayed());
    }

    @Then("kullanici delete butonuna tiklar")
    public void kullaniciDeleteButonunaTiklar() {
        us_17page.delete.click();
    }

    @And("secilen kisinin silindigini dogrular")
    public void secilenKisininSilindiginiDogrular() throws InterruptedException {
        Thread.sleep(3000);
        us_17page.confirmDelete.click();
        Thread.sleep(3000);
        Assert.assertTrue(us_17page.silindiMesaji.isDisplayed());
    }

    @And("admin activates the customer")
    public void adminActivatesTheCustomer() {
        us_17page.creatDate.click();
        Driver.getDriver().findElement(By.xpath("//tr[@id='" + ConfigurationReader.getProperty("demo_username") + "']//td//button")).click();
        ReusableMethods.waitFor(2);

    }
}