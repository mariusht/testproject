package Pages;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class AllTopsMenPage {

    private WebDriver driver;
    WebElement firstProductOnPage;

    public AllTopsMenPage (WebDriver aDriver) {driver = aDriver;}

    public void openAllTopsMenPage(){
        //Save current tab handle
        String oldTab = driver.getWindowHandle();

        //Open category "Tops"
        WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//area[contains(@href, 'view-all-tops')]")));
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click();", element);

        //Switch to new tab and verify that it is opened correctly
        Set<String> myTabs = driver.getWindowHandles();
        String newTab = "";
        for (String aHandle : myTabs){
            if(!oldTab.contentEquals(aHandle)){
                newTab = aHandle;
                break;
            }
        }
        driver.switchTo().window(newTab);
        Assert.assertThat(driver.getTitle(), Is.is("VIEW ALL TOPS - TOPS - MEN | UNIQLO"));
    }

    public void selectFirstProductOnPage(){
    firstProductOnPage = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.className("item    first")));
    firstProductOnPage.click();
    }
}
