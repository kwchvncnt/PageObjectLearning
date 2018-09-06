package Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyTest {
    @Test
    public void testLogin() throws Exception {
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.i.ua");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Assert.assertEquals(nameUser,"test","user is not logged in");

        //driver.quit();

    }
}
