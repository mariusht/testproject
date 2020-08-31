package Pages;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class OuterwearMensPage {

    private WebDriver driver;

    public OuterwearMensPage(WebDriver aDriver){driver = aDriver;}

    public void openOuterwearPage(){
        //Save old tab handle
        String oldTab = driver.getWindowHandle();

        //Open category "Outerwear"
        WebElement outerwear = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//area[contains(@href, 'view-all-outerwear')]")));
        outerwear.click();

        //Switch to new tab IF opened in new tab
        Set<String> myTabs = driver.getWindowHandles();
        String newTab = "";
        for (String aHandle : myTabs){
            if(!oldTab.contentEquals(aHandle)){
                newTab = aHandle;
                break;
            }
            driver.switchTo().window(newTab);
            Assert.assertThat(driver.getTitle(), Is.is("VIEW ALL OUTERWEAR - OUTERWEAR - MEN  | UNIQLO"));
    }
    public void selectOuterwearProduct(){
         WebElement outerwear = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("")));

         //Select product
        List<WebElement> products = driver.findElements(By.xpath("//li[contains(@class,'item') and not (contains(@class, 'menu'))] "));
        int numberOfProducts = products.size();
        System.out.println(numberOfProducts);
        Random rand = new Random();
        int randomProduct = rand.nextInt(numberOfProducts);

        //Select random available size and available color
        List<WebElement> colors = driver.findElements(By.cssSelector(".selectAttr [color]"));
        int numberOfColors = colors.size();
        System.out.println(numberOfColors);


        }

    }
}
