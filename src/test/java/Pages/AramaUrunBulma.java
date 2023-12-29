package Pages;

import org.openqa.selenium.*;
import org.testng.Assert;
import util.ElementHelper;

import static org.testng.AssertJUnit.assertEquals;

public class AramaUrunBulma {
    static WebDriver driver;
    util.ElementHelper elementHelper;
    By aramaButton = By.xpath("//i[@class='searchBoxOld-tTG7JNOHj3NJJUdZrfNp']");
    By ilkUrun = By.xpath("//a[@title='Hp 250 G8 Intel Core I5-1135G7 8 GB 256GB SSD Freedos 15.6\" FHD Taşınabilir Bilgisayar 853U8ES']//h3[@type='comfort']");
    By urunDegerlendirme = By.xpath("//a[@id='productReviewsTab']");
    By faydaliButton = By.xpath("//div[@class='paginationContentHolder']/div[1]//div[@class='thumbsUp hermes-ReviewCard-module-lOsa4wAwncdp3GgzpaaV']");
    public AramaUrunBulma(WebDriver driver) {
        AramaUrunBulma.driver=driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void aramaUrun() throws InterruptedException {
        driver.findElement(aramaButton).click();
        Thread.sleep(1000);
        WebElement aramaTextBox = driver.findElement(By.cssSelector("input[placeholder='Ürün, kategori veya marka ara']"));
        aramaTextBox.sendKeys("Bilgisayar", Keys.ENTER);


    }

    public void ilkUrun() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", " ");
        driver.findElement(ilkUrun).click();

        for (String handle:
                driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
    }

    public void urunDegerlendirme() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,1500)", " ");
        driver.findElement(urunDegerlendirme).click();
    }

    public void faydaliButton() throws InterruptedException {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,700)", " ");
        Thread.sleep(1000);
        driver.findElement(faydaliButton).click();
        Thread.sleep(1000);
    }


    public void kontrolYorum() {
        WebElement kontrol = driver.findElement(faydaliButton);
        String kontrolText = kontrol.getText();
        Assert.assertNotNull(kontrolText, "Teşekkür ederiz.");
    }
}