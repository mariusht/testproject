package Tests;

import Pages.AllTopsMenPage;
import Pages.HomePage;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.Set;


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
        AllTopsMenPage allTopsMenPage = new AllTopsMenPage(driver);
        allTopsMenPage.openAllTopsMenPage();
        allTopsMenPage.selectFirstProductOnPage();



    }
}
