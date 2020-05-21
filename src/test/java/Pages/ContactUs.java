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
        WebElement firstNameField = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.className("form-set-parts-input mgr20 js-input-wrapper")));

        firstNameField.sendKeys("John");
    }
}
