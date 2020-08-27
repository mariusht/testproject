package Tests;

import Pages.HomePage;
import Pages.TshirtsMenPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class selectMensProduct {
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    @Test
    public void selectMensProduct(){
        HomePage homePage = new HomePage(driver);
        homePage.openMensPage();
        TshirtsMenPage tshirtsMenPage = new TshirtsMenPage(driver);
        tshirtsMenPage.openAllTopsMenPage();
        tshirtsMenPage.selectATshirtOnPage();
    }

   /* @AfterClass()
    public static void closeBrowser(){
    driver.quit(); }*/
}
