package Tests;

import Pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openShoppingCart {
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){driver = new ChromeDriver();}

    @Test
    public void openShoppingCart(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.clickShoppingCart();
    }

    @AfterClass
    public static void closeBrowser(){
        driver.close();
    }
}
