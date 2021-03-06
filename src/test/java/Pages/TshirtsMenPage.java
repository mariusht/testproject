package Pages;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TshirtsMenPage {

    private WebDriver driver;

    public TshirtsMenPage(WebDriver aDriver) {driver = aDriver;}

    public void openAllTopsMenPage(){
        //Save current tab handle
        String oldTab = driver.getWindowHandle();

        //Open category "Tops"
        WebElement tops = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//area[contains(@href, 'men/tops/t-shirts')]")));
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click();", tops);

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
        Assert.assertThat(driver.getTitle(), Is.is("T-SHIRTS - TOPS - MEN | UNIQLO"));
    }

    public void selectATshirtOnPage(){
        //Selects any short sleeve product on page
        WebElement productOnPage = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Short Sleeve")));
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click();", productOnPage);

        //Select a random available size on default color and add to cart
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //WebElement availableSizes = new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.id("selectSizeDetail")));
        String initialCartCount = driver.findElement(By.cssSelector(".icon.bag_qty")).getText();
        System.out.print(initialCartCount);
        List<WebElement> sizes = driver.findElements(By.cssSelector("#tertiary li[size][class]:not([class*='disable'])"));
        int numberOfSizes = sizes.size();
        System.out.print(numberOfSizes);
        Random rand = new Random();
        int randomValue = rand.nextInt(numberOfSizes);
        WebElement sizeButton = sizes.get(randomValue);
        JavascriptExecutor ex3 = (JavascriptExecutor) driver;
        ex3.executeScript("arguments[0].click();", sizeButton);
        WebElement cartButton = driver.findElement(By.cssSelector("[type=\"button\"][title=\"ADD TO BAG\"]"));
        JavascriptExecutor ex2 = (JavascriptExecutor) driver;
        ex2.executeScript("arguments[0].click();", cartButton);
        String newCartCount = new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".icon.bag_qty"))).getText();
        System.out.print(newCartCount);
        Assert.assertNotEquals(newCartCount, initialCartCount);
    }
}

