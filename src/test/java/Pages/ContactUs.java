package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
/*

        List<WebElement> inquiryTitleOptions = driver.findElements(By.cssSelector(".is-error option[value]"));
        Random rand = new Random();
        int selectedInquiryTitleOption = rand.nextInt(inquiryTitleOptions.size());
        inquiryTitleDropdown = inquiryTitleOptions.get(selectedInquiryTitleOption);
        inquiryTitleDropdown.click();
*/
        Select selectTitle = new Select(inquiryTitleDropdown);
        selectTitle.selectByVisibleText("Compliment");
        Select selectCategory1 = new Select(inquiryCategory1Dropdown);
        selectCategory1.selectByVisibleText("Product");
        inquiryCategory2Dropdown = new WebDriverWait(driver, 40).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Quality")));
        Select selectCategory2 = new Select(inquiryCategory2Dropdown);
        selectCategory2.selectByVisibleText("Quality");
        inquiryContentsField.sendKeys("Inquiry content goes here");

    }
}
