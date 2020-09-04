package Tests;

import Pages.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class verifyHomePageOpens {
    private static WebDriver driver;
    static ExtentTest test;
    static ExtentReports report;

    @BeforeClass
    public static void createDriver() {
        driver = new ChromeDriver();
        report = new ExtentReports(System.getProperty("/Users/Marius/projects/testproject/TestReports/") + "/ExtentReportResults.html");
        test = report.startTest("Homepage open");
    }

    @Test
    public void verifyHomePageOpens() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();

        if (driver.getTitle().equals("Home page | UNIQLO")) {
            test.log(LogStatus.PASS, "Test passed and logged");
        } else {
            test.log(LogStatus.FAIL, "Test failed and logged");

        }

    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
        report.endTest(test);
        report.flush();
    }
}

