package Initializing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.poi.xssf.usermodel.*;
import java.io.IOException;

public class setup {
    public static WebDriver driver;

    public static void createChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    public static void readFromFile(int rowcounter) throws IOException {
        XSSFWorkbook srcBook = new XSSFWorkbook("/Users/Marius/projects/Testfile.xls");
        XSSFSheet sourceSheet = srcBook.getSheetAt(0);
        int rownum = rowcounter;
        XSSFRow sourceRow = sourceSheet.getRow(rownum);
        XSSFCell firstName = sourceRow.getCell(0);
        XSSFCell lastName = sourceRow.getCell(1);
        XSSFCell email = sourceRow.getCell(2);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);

    }
}
