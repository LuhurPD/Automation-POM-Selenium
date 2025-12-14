package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.DashboardAkulakuPage;
import utils.ConfigReader;
import utils.DriverFactory;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

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
          /*  File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("screenshots/home.png");

            try {
                FileUtils.copyFile(src, dest);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/


        }



    @When("user click home")
    public void clickHome() {
        DashboardAkulakuPage.clickHome();
        DashboardAkulakuPage.validastebanner();
       // DashboardAkulakuPage.validatepage();


    }
    @When("user on Landing page Kategori")
    public void laningkategory() throws IOException {
    DashboardAkulakuPage.thumbnailsVideo();
/*
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshots/kategori.png");

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    }

    @And("User Input key {string}")
    public void userInputKey(String arg0) {
        // Write code here that turns the phrase above into concrete actions


        DashboardAkulakuPage.EnterSearch("Vaksin");
        /*File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshots/Searchinput.png");

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        DashboardAkulakuPage.Vaksin1();
        DashboardAkulakuPage.Vaksin2();


    }
}
