package PageObjectpackage;

import CommonPackage.Driverfactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class ProductPage extends Driverfactory {

    public void baseurl(){
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.diy.com/");

        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app-header\"]/div[2]/nav/ul/li[2]/span"))).build().perform();
        actions.moveToElement(driver.findElement(By.linkText("Taps"))).click().build().perform();
    }
    public void selecttap() throws InterruptedException {
        driver.findElement(By.linkText("Single Lever Taps")).click();
        driver.findElement(By.cssSelector("svg[aria-label='£30 - £40']")).click();

        JavascriptExecutor jj=(JavascriptExecutor)driver;
        jj.executeScript("window.scrollBy(0,400)");

        WebDriverWait wait=new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[data-test-id='productTitle']")));
        try {
            List<WebElement> tap = driver.findElements(By.cssSelector("p[data-test-id='productTitle']"));
            System.out.println(tap.size());
            Random random = new Random();
            WebElement randomno = tap.get(random.nextInt(tap.size()));
            Thread.sleep(3000);
            randomno.click();
        }catch (StaleElementReferenceException r){
            System.out.println(r);
        }
        driver.findElement(By.xpath("//button[@class='_6317a47c f2a1dff0 b9523d7b cf7e7c37 b48f4ced _38e857b5 eec494cf b7d7b84f _49e8bd5b d45cde1d']//span[@class='e433fa60 f9f4120c'][contains(text(),'Add to basket')]")).click();

    }

}
