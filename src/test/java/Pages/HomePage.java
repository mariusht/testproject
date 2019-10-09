package Pages;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    private WebDriver driver;
    

    public HomePage (WebDriver aDriver) {driver = aDriver;}

    public void openHomePage(){
        driver.manage().window().maximize();
        driver.get("https://www.uniqlo.com/au/store/");
        Assert.assertThat(driver.getTitle(), Is.is("Home page | UNIQLO"));
    }

    public void openMensPage(){
        driver.manage().window().maximize();
        openHomePage();
        WebElement mensButton = driver.findElement(By.id("header_men"));
        mensButton.click();
    }


}
