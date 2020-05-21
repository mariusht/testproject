package Tests;

import Pages.ContactUs;
import Pages.HomePage;
import org.hamcrest.core.Is;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class submitContactForm {
    private static WebDriver driver;


    @BeforeClass
    public static void createDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    @Test
    public void submitContactForm(){
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openHomePage();
        homePage.clickContactUs();
        ContactUs contactUs = new ContactUs(driver);
        contactUs.fillInForm();

    }

   /* @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }*/
}