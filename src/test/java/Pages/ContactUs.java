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
        WebElement firstNameField = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='j_id0:j_id274:j_id280']")));
        WebElement lastNameField = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='j_id0:j_id274:j_id282']")));
        WebElement eMailField = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='']")));
        WebElement phoneField = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='']")));
        WebElement inquiryContentsField = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='']")));




        firstNameField.sendKeys("John");
    }
}
