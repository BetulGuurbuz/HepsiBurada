package StepDefinitions;

import Pages.MenudenUrunBulma;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MenudenStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    MenudenUrunBulma menudenUrunBulma = new MenudenUrunBulma(driver);

    @Given("Kullanici anasayfadadir")
    public void kullaniciAnasayfadadir() {
        menudenUrunBulma.anaSayfa();
    }

    @Given("Cookie kabul edilir")
    public void cookieKabulEdilir() {
        menudenUrunBulma.cookieKabul();
    }

    @Given("Ust menuden Elektronik - Bilgisayar Tablet - Notebook tiklar")
    public void ustMenudenElektronikBilgisayarTabletNotebookTiklar() throws InterruptedException {
        menudenUrunBulma.ustMenuSecim();
    }

    @Given("Cok satanlar siralamasini secer")
    public void cokSatanlarSiralamasiniSecer() {
        menudenUrunBulma.siralamaCokSatanlar();
    }

    @When("Urunlerden ilkine tiklar")
    public void urunlerdenIlkineTiklar() {
        menudenUrunBulma.ilkUrun();
    }

    @When("Urun adetini artirir")
    public void urunAdetiniArtirir() {
        menudenUrunBulma.urunAdet();
    }

    @Then("Sepete ekler")
    public void sepeteEkler() {
        menudenUrunBulma.sepetEkle();
    }


}
