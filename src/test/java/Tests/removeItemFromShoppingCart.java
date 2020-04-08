package Tests;

import Pages.HomePage;
import Pages.TshirtsMenPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class removeItemFromShoppingCart {
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    @Test
    public void removeItemFromShoppingCart(){
        HomePage homepage = new HomePage(driver);
        homepage.openMensPage();
        TshirtsMenPage tshirtsMenPage = new TshirtsMenPage(driver);
        tshirtsMenPage.openAllTopsMenPage();
        tshirtsMenPage.selectAProductOnPage();
        homepage.clickShoppingCart();
        homepage.removeItemFromShoppingCart();

    }
}
