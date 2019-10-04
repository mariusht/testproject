package Tests;

import Pages.HomePage;
import org.hamcrest.core.Is;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyHomePageOpens {
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){driver = new ChromeDriver();}

    @Test
    public void verifyHomePageOpens(){
    HomePage homePage = new HomePage(driver);
    homePage.openHomePage();
    Assert.assertThat(driver.getTitle(), Is.is("Home page | UNIQLO"));

    }

    @AfterClass
    public static void closeBrowser(){driver.quit();}
}

