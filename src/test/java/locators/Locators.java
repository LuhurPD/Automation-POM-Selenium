package locators;
import org.openqa.selenium.By;

public interface Locators {
    By USERNAME_FIELD = By.id("username");
    By PASSWORD_FIELD = By.id("password");
    By LOGIN_BUTTON   = By.cssSelector("button[type='submit']");
    By FLASH_MESSAGE  = By.id("flash");

    By LABLE_BERANDA =By.xpath("//a[normalize-space()='Beranda']");

    By Img_banner =By.xpath("(//img[@alt='Logo.png'])[1]");

    By Video_1 =By.xpath("//iframe[contains(@src,'youtube.com')[1]]");


}
