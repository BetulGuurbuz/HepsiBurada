package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.asserts.Assertion;
import util.ElementHelper;


public class MenudenUrunBulma {
    static WebDriver driver;
    util.ElementHelper elementHelper;

    By cookieKabul = By.id("onetrust-accept-btn-handler");
    By siralama = By.xpath("//label[@class='horizontalSortingBar-Ce404X9mUYVCRa5bjV4D']");
    By siralamaCokSatanlar = By.xpath("//div[contains(text(),'Çok satanlar')]");
    By ilkUrun = By.xpath("//a[@title='Casper Excalibur G870.1245-BFA0X-B Intel Core i5 12450H 16GB 1TB SSD RTX4050 Freedos 15.6\" Taşınabilir Bilgisayar']//h3[@type='comfort']");
    By urunAdetArtir = By.xpath("//button[@title='Arttır']");
    By sepetEkle = By.xpath("//button[@id='addToCart']");


    public MenudenUrunBulma(WebDriver driver) {
        MenudenUrunBulma.driver=driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void anaSayfa() {
        driver.get("https://www.hepsiburada.com/");
    }

    public void cookieKabul() {
        driver.findElement(cookieKabul).click();
    }

    public void ustMenuSecim() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        WebElement ustElektronik = driver.findElement(By.xpath("//span[contains(text(),'Elektronik')]"));
        actions.moveToElement(ustElektronik).build().perform();

        WebElement ustBilgisayarTablet = driver.findElement(By.xpath("//a[normalize-space()='Bilgisayar/Tablet']"));
        actions.moveToElement(ustBilgisayarTablet).build().perform();

        WebElement ustNotebook = driver.findElement(By.xpath("//span[normalize-space()='Notebook,']"));
        actions.click(ustNotebook).build().perform();
    }


    public void siralamaCokSatanlar() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,750)", " ");
        driver.findElement(siralama).click();
        driver.findElement(siralamaCokSatanlar).click();
    }

    public void ilkUrun() {
        driver.findElement(ilkUrun).click();

        for (String handle:
        driver.getWindowHandles()){
            driver.switchTo().window(handle);
            driver.close();
        }

    }
    public void urunAdet() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", " ");
        driver.findElement(urunAdetArtir).click();

    }

    public void sepetEkle() {
        driver.findElement(sepetEkle).click();
    }
}