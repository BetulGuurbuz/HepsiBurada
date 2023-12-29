package StepDefinitions;

import Pages.AramaUrunBulma;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class AramaStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    AramaUrunBulma aramaUrunBulma = new AramaUrunBulma(driver);

    @Given("Urun arama alanindan bilgisayar aratilir")
    public void urunAramaAlanindanBilgisayarAratilir() throws InterruptedException {
        aramaUrunBulma.aramaUrun();
    }

    @Given("Gelen urunlerden ilkine tiklanir")
    public void gelenUrunlerdenIlkineTiklanir() {
        aramaUrunBulma.ilkUrun();
    }

    @Given("Urun detaydan degerlendirmelere tiklanir")
    public void urunDetaydanDegerlendirmelereTiklanir() {
        aramaUrunBulma.urunDegerlendirme();
    }

    @Then("Ilk yoruma faydali butonuna tiklanir")
    public void ılkYorumaFaydaliButonunaTiklanir() throws InterruptedException {
        aramaUrunBulma.faydaliButton();
    }

    @Then("Yorum olup olmadigini kontrol eder")
    public void yorumOlupOlmadiginiKontrolEder() {
        aramaUrunBulma.kontrolYorum();
    }
}
