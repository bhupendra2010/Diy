package PageObjectpackage;

import CommonPackage.Driverfactory;
import org.openqa.selenium.By;

public class StorePage extends Driverfactory {

    public void storefinder(){
        driver.findElement(By.cssSelector("svg[aria-label='Store marker']")).click();
        driver.findElement(By.name("location")).sendKeys("RH10 5HH");
        driver.findElement(By.className("_6e6b828e")).click();
        driver.findElement(By.xpath("//div[@class='_7be6e5a0 _66dabd6a f2176795 add6a611']//div//div[1]//div[1]//div[1]//div[3]//div[1]//a[1]//span[2]")).click();
    }
}
