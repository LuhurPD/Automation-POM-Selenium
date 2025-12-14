package pageObjects;
import locators.Locators;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
    public void validastebanner(){

        boolean isBannerDisplayed  =driver.findElement(Img_banner).isDisplayed();
        Assert.assertTrue(isBannerDisplayed, "Banner is NOT displayed");
    }
}

