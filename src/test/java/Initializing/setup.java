package Initializing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.poi.xssf.usermodel.*;

public class setup {
    public static WebDriver driver;

    public static void createChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    public static void readFromFile(){
        XSSFWorkbook srcBook = new XSSFWorkbook("/Users/Marius/projects/Testfile.xls");

    }
}
