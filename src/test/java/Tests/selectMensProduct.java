package Tests;

import Pages.TshirtsMenPage;
import Pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


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
        tshirtsMenPage.selectAProductOnPage();
    }

    //@AfterClass()
    //public static void closeBrowser(){
    //driver.quit(); }
}
