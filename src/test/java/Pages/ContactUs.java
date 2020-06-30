package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUs {
    private WebDriver driver;

    public ContactUs (WebDriver aDriver) {driver = aDriver;}

    public void fillInForm(){
        WebElement firstNameField = new WebDriverWait(driver,40).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='j_id0:j_id274:j_id280']")));
        WebElement lastNameField = new WebDriverWait(driver,40).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='j_id0:j_id274:j_id282']")));
        WebElement eMailField = new WebDriverWait(driver,40).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='j_id0:j_id274:j_id284']")));
        WebElement phoneField = new WebDriverWait(driver,40).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='j_id0:j_id274:j_id286']")));
        WebElement inquiryContentsField = new WebDriverWait(driver,40).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("textarea[name='j_id0:j_id274:j_id298']")));
        WebElement inquiryTitleDropdown = new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[name='j_id0:j_id274:j_id288']")));
        WebElement inquiryCategory1Dropdown = new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[name='j_id0:j_id274:j_id292']")));
        WebElement inquiryCategory2Dropdown = new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[name='j_id0:j_id274:subcategory2uq']")));


        firstNameField.sendKeys("John");
        lastNameField.sendKeys("Test");
        eMailField.sendKeys("johntest@johntest.com");
        phoneField.sendKeys("0123456789");
        inquiryContentsField.sendKeys("Inquiry content goes here");
    }
}
