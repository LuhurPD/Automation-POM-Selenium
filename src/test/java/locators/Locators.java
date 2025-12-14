package locators;
import org.openqa.selenium.By;

public interface Locators {
    By USERNAME_FIELD = By.id("username");
    By Field_Cari = By.xpath("//div[@class='mr-[40px]']//input[@placeholder='Cari...']");
    By LOGIN_BUTTON   = By.cssSelector("button[type='submit']");
    By FLASH_MESSAGE  = By.id("flash");

    By LABLE_BERANDA =By.xpath("//a[normalize-space()='Beranda']");

    By Img_banner =By.xpath("(//img[@alt='Logo.png'])[1]");

    By Video_1 =By.cssSelector("div[role='menu'] div:nth-child(1) div:nth-child(1)");

    By Page_1 =By.cssSelector("[aria-current='page']");

    By Img_vaksin =By.cssSelector("[href='/content/116'] .font-bold");

    By Img_vaksin2 =By.xpath("[href='/content/84'] .font-bold");


}
