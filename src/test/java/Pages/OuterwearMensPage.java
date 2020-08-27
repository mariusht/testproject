package Pages;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class OuterwearMensPage {

    private WebDriver driver:

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
            
        }
}
