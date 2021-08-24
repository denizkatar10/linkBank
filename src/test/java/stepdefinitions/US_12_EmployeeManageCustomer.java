package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_12_EmployeeManageCustomer {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    ControlPage controlPage = new ControlPage();
    CreateOrEditACostumer createOrEditACostumer = new CreateOrEditACostumer();
    ManageCustomers manageCustomers = new ManageCustomers();



    @Given("employee on the application page")
    public void employee_on_the_application_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
    }




    @Given("employee enters username")
    public void employee_enters_username() {
        signInPage.usernametext.sendKeys(ConfigurationReader.getProperty("employee_username"));

    }
    @Given("employee enters password")
    public void employee_enters_password() {
        signInPage.passwordtext.sendKeys(ConfigurationReader.getProperty("employee_password"));
    }


    @And("sayfada Create Date yazisi goruluyor mu")
    public void sayfadaCreateDateYazisiGoruluyorMu() {
        Assert.assertEquals("Create Date", manageCustomers.CreateDateTxt.getText());
    }


    @And("sayfada ID yazisi goruluyor mu")
    public void sayfadaIDYazisiGoruluyorMu() {
        Assert.assertEquals("ID", manageCustomers.IDTxt.getText());
    }

    @And("sayfada First Name yazisi goruluyor mu")
    public void sayfadaFirstNameYazisiGoruluyorMu() {
        Assert.assertEquals("First Name", manageCustomers.FirstNameTxt.getText());
    }

    @And("sayfada Last Name yazisi goruluyor mu")
    public void sayfadaLastNameYazisiGoruluyorMu() {
        Assert.assertEquals("Last Name", manageCustomers.LastNameTxt.getText());
    }

    @And("sayfada Middle Initial yazisi goruluyor mu")
    public void sayfadaMiddleInitialYazisiGoruluyorMu() {
        Assert.assertEquals("Middle Initial", manageCustomers.MiddleInitialTxt.getText());
    }

    @And("sayfada Email yazisi goruluyor mu")
    public void sayfadaEmailYazisiGoruluyorMu() {
        Assert.assertEquals("Email", manageCustomers.EmailTxt.getText());

    }

    @And("sayfada Mobile Phone Number yazisi goruluyor mu")
    public void sayfadaMobilePhoneNumberYazisiGoruluyorMu() {
        Assert.assertEquals("Mobile Phone Number", manageCustomers.MobilePhoneNumberTxt.getText());
    }

    @And("sayfada Phone Number yazisi goruluyor mu")
    public void sayfadaPhoneNumberYazisiGoruluyorMu() {
        Assert.assertEquals("Phone Number", manageCustomers.PhoneNumberTxt.getText());
    }

    @And("sayfada Address yazisi goruluyor mu")
    public void sayfadaAddressYazisiGoruluyorMu() {
        Assert.assertEquals("Address", manageCustomers.AddressTxt.getText());
    }

    @Given("View butonu olmalidir")
    public void viewButonuOlmalidir() {
        Assert.assertEquals("View", manageCustomers.ViewTxt.getText());
    }


    @Then("View butonu tikladiginda butun musteri bilgilerinin olgugu sayfa acilmalidir")
    public void viewButonuTikladigindaButunMusteriBilgilerininOlguguSayfaAcilmalidir() {
        manageCustomers.ViewTxt.click();

    }

    @And("Bir musterinin First Name bilgisi gorulebilmelidir")
    public void birMusterininFirstNameBilgisiGorulebilmelidir() {
        Assert.assertEquals("First Name", manageCustomers.FirstNameTxt.getText());
    }

    @And("Bir musterinin Last Name bilgisi gorulebilmelidir")
    public void birMusterininLastNameBilgisiGorulebilmelidir() {
        Assert.assertEquals("Last Name", manageCustomers.LastNameTxt.getText());
    }

    @And("Bir musterinin Middle Initial bilgisi gorulebilmelidir")
    public void birMusterininMiddleInitialBilgisiGorulebilmelidir() {
        Assert.assertEquals("Middle Initial", manageCustomers.MiddleInitialTxt.getText());
    }

    @And("Bir musterinin Email bilgisi gorulebilmelidir")
    public void birMusterininEmailBilgisiGorulebilmelidir() {
        Assert.assertEquals("Email", manageCustomers.EmailTxt.getText());
    }

    @And("Bir musterinin Mobile Phone Number bilgisi gorulebilmelidir")
    public void birMusterininMobilePhoneNumberBilgisiGorulebilmelidir() {
        Assert.assertEquals("Mobile Phone Number", manageCustomers.MobilePhoneNumberTxt.getText());
    }

    @And("Bir musterinin Phone Number bilgisi gorulebilmelidir")
    public void birMusterininPhoneNumberBilgisiGorulebilmelidir() {
        Assert.assertEquals("Phone Number", manageCustomers.PhoneNumberTxt.getText());
    }

    @And("Bir musterinin Zip Code bilgisi gorulebilmelidir")
    public void birMusterininZipCodeBilgisiGorulebilmelidir() {
        Assert.assertEquals("Zip Code", manageCustomers.ZipCodeTxt.getText());

    }

    @And("Bir musterinin Address bilgisi gorulebilmelidir")
    public void birMusterininAddressBilgisiGorulebilmelidir() {
        Assert.assertEquals("Address", manageCustomers.AddressTxt.getText());
    }

    @And("Bir musterinin City bilgisi gorulebilmelidir")
    public void birMusterininCityBilgisiGorulebilmelidir() {
        Assert.assertEquals("City", manageCustomers.CityTxt.getText());
    }

    @And("Bir musterinin Ssn bilgisi gorulebilmelidir")
    public void birMusterininSsnBilgisiGorulebilmelidir() {
        Assert.assertEquals("Ssn", manageCustomers.SsnTxt.getText());
    }

    @And("Bir musterinin Create Date bilgisi gorulebilmelidir")
    public void birMusterininCreateDateBilgisiGorulebilmelidir() {
        Assert.assertEquals("Create Date", manageCustomers.CreateDateTxt.getText());
    }

    @And("Bir musterinin Zelle Enrolled bilgisi gorulebilmelidir")
    public void birMusterininZelleEnrolledBilgisiGorulebilmelidir() {
        Assert.assertEquals("Zelle Enrolled", manageCustomers.ZelleEnrolledTxt.getText());
    }

    @And("Bir musterinin Country bilgisi gorulebilmelidir")
    public void birMusterininCountryBilgisiGorulebilmelidir() {
        Assert.assertEquals("Country", manageCustomers.CountryTxt.getText());
    }

    @And("Bir musterinin State bilgisi gorulebilmelidir")
    public void birMusterininStateBilgisiGorulebilmelidir() {
        Assert.assertEquals("State", manageCustomers.StateTxt.getText());
    }

    @And("Bir musterinin User bilgisi gorulebilmelidir")
    public void birMusterininUserBilgisiGorulebilmelidir() {
        Assert.assertEquals("User", manageCustomers.UserTxt.getText());
    }

    @And("Bir musterinin Account bilgisi gorulebilmelidir")
    public void birMusterininAccountBilgisiGorulebilmelidir() {
        Assert.assertEquals("Account", manageCustomers.AccountTxt.getText());
    }


    @Then("Tüm müşteri bilgilerinin düzenlenebileceği bir Edit düğmesi olmalıdır.")
    public void tümMüşteriBilgilerininDüzenlenebileceğiBirDüzenleDüğmesiOlmalıdır() {
        Driver.getDriver().navigate().back();
        Assert.assertEquals("Edit", manageCustomers.EditTxt.getText());

    }

    @Then("Edit botunu click edildiginde Edit sayfasi goruntulenmelidir")
    public void editBotununaClickEdildigindeEditSayfasiGoruntulenmelidir() {
       manageCustomers.EditTxt.click();
    }

    @And("sayfada Edit butonu gorulebilmeldir")
    public void sayfadaEditButonuGorulebilmeldir() {
        Assert.assertEquals("Edit", manageCustomers.EditTxt.getText());
    }

    @And("sayfada First Name box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaFirstNameBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.FirstNameBox.clear();
        manageCustomers.FirstNameBox.sendKeys("ZEKI");

    }

    @And("sayfada Last Name box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaLastNameBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.LastNameBox.clear();
        manageCustomers.LastNameBox.sendKeys("ER");

    }

    @And("sayfada Middle Initial box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaMiddleInitialBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.MiddleInitialBox.clear();
         manageCustomers.MiddleInitialBox.sendKeys( "ZE");

    }

    @And("sayfada Email box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaEmailBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.EmailBox.clear();
        manageCustomers.EmailBox.sendKeys("ze123@gmail.com");
    }

    @And("sayfada Mobile Phone Number box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaMobilePhoneNumberBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.MobilePhoneNumberBox.clear();
        manageCustomers.MobilePhoneNumberBox.sendKeys("1233987654");
    }

    @And("sayfada Phone Number box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaPhoneNumberBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {

        manageCustomers.PhoneNumberBox.clear();
        manageCustomers.PhoneNumberBox.sendKeys("34543267");
    }

    @And("sayfada Zip Code box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaZipCodeBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.ZipCodeBox.clear();
        manageCustomers.ZipCodeBox.sendKeys("5544");
    }

    @And("sayfada Address box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaAddressBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.AddressBox.clear();
        manageCustomers.AddressBox.sendKeys("Bahcelievler sokak, No: 55");
    }

    @And("sayfada City box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaCityBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.CityBox.clear();
        manageCustomers.CityBox.sendKeys("Huno Lulu");
    }

    @And("sayfada Ssn box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaSsnBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.SsnBox.clear();
        manageCustomers.SsnBox.sendKeys("234-56-8765");
    }

    @And("sayfada Create Date box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaCreateDateBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.CreateDateBox.clear();
        manageCustomers.CreateDateBox.sendKeys("11.11.2021", Keys.TAB, "1234");
    }

/*
    @And("Bir musterinin Country bilgisi secilebilmelidir")
    public void sayfadaCountryBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.CountryBox.click();
    }*/

    @And("sayfada State box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaStateBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.StateBox.clear();
        manageCustomers.StateBox.sendKeys("NY");
    }
/*
    @And("sayfada User box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaUserBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.UserBox.click();
    }

    @And("sayfada Account box da bilgiler olusturulabilmeli veya guncellenebilmelidir")
    public void sayfadaAccountBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.AccountBox.clear();
    }*/

    @And("Bir musterinin Zelle Enrolled box click edilebilmelidir")
    public void sayfadaZelleEnrolledBoxDaBilgilerOlusturulabilmeliVeyaGuncellenebilmelidir() {
        manageCustomers.ZelleEnrolledBox.click();
    }

    @And("kullanici costumers sayfasina gitmelidir")
    public void kullaniciCostumersSayfasinaGitmelidir() {
        Driver.getDriver().navigate().back();
    }

    @And("bir musteriyi silmek icin Delete butonuna click etmmelidir")
    public void birMusteriyiSilmekIcinDeleteButonunaClickEtmmelidir() {
        manageCustomers.DeleteTxt.click();
    }


}
