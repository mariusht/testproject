package Tests;

import Pages.HomePage;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
        //Open category "Tops"
        WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//area[contains(@href, 'view-all-tops')]")));
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();

    }
}
