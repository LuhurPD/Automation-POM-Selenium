package pageObjects;
import locators.Locators;
import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
//import org.junit.testng.Assert;




public class DashboardAkulakuPage implements Locators {

    WebDriver driver;

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

        List<WebElement> youtubeFrames =
                driver.findElements(Video_1);

        int expectedCount = 5;
        int actualCount = youtubeFrames.size();

        Assert.assertEquals(
                String.valueOf(String.valueOf(youtubeFrames.size())),
                5,
                "Thumbnail YouTube tidak berjumlah 5"
        );

    }


}

