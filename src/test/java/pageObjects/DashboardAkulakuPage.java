package pageObjects;
import locators.Locators;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTrue;





public class DashboardAkulakuPage implements Locators {

    WebDriver driver;
    protected WebDriverWait wait;

    protected void waitUrlContains(String urlPart) {
        wait.until(ExpectedConditions.urlContains(urlPart));
    }

    public DashboardAkulakuPage(WebDriver driver) {
        this.driver = driver;
    }

    public String GetLabeBeranda(){

        return driver.findElement(LABLE_BERANDA).getText();
    }
    public void clickHome(){
        driver.findElement(LABLE_BERANDA).click();
    }

    public void validastebanner() {
        assertTrue(
                driver.findElement(Img_banner).isDisplayed(),
                "Banner is NOT visible"
        );


    }
    public void  thumbnailsVideo() {

        driver.findElement(Video_1).isDisplayed();

       /* List<WebElement> youtubeFrames =
                driver.findElements(Video_1);

        int expectedCount = 5;
        int actualCount = youtubeFrames.size();

        Assert.assertEquals(
                String.valueOf(String.valueOf(youtubeFrames.size())),
                5,
                "Thumbnail YouTube tidak berjumlah 5"
        ); */

    }


    public void EnterSearch(String Search){

       driver.findElement(Field_Cari).sendKeys(Search);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Field_Cari));
    }


    public void Vaksin1() {
        boolean isDisplayed = driver.findElement(Img_vaksin).isDisplayed();
        Assert.assertTrue("Gambar vaksin tidak tampil", isDisplayed);

    }


    public void Vaksin2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Img_vaksin2));

        boolean isDisplayed = driver.findElement(Img_vaksin2).isDisplayed();
        Assert.assertTrue("Gambar vaksin tidak tampil", isDisplayed);
//test
    }


}

