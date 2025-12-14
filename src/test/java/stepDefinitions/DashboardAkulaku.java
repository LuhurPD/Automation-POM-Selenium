package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.DashboardAkulakuPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class DashboardAkulaku {
    WebDriver driver;
    DashboardAkulakuPage DashboardAkulakuPage;
    @Given("user on Landing page akulaku")
    public void userOnLandingPageAkulaku() {


        driver = DriverFactory.getDriver(); // ✅ ambil dari DriverFactory
        driver.get(ConfigReader.getBaseUrl() + "/login");
        DashboardAkulakuPage  = new DashboardAkulakuPage(driver);

    }

        @Given("user on Landing page Kategori akulaku")
        public void userOnLandingPagekategoriAkulaku() {


            driver = DriverFactory.getDriver(); // ✅ ambil dari DriverFactory
            driver.get(ConfigReader.getBaseUrlKategori() + "/login");
            DashboardAkulakuPage  = new DashboardAkulakuPage(driver);

        }



    @When("user click home")
    public void clickHome() {
        //DashboardAkulakuPage.clickHome();
        DashboardAkulakuPage.validastebanner();
       // DashboardAkulakuPage.validatepage();


    }
    @When("user on Landing page Kategori")
    public void laningkategory() {
DashboardAkulakuPage.thumbnailsVideo();


    }
}
