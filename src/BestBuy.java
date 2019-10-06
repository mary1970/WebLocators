import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class BestBuy {
    static WebDriver driver;
    public static void chromeInvocation(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");

        driver=new ChromeDriver();

    }

    public static void main(String[] args)throws InterruptedException {
        chromeInvocation();
        driver.get("http://www.ebay.com");
        driver.findElement(By.name("_nkw")).sendKeys("Ba");
        Thread.sleep(5000);
        driver.findElement(By.name("_nkw")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(5000);
        driver.findElement(By.name("_nkw")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(5000);
        driver.findElement(By.name("_nkw")).sendKeys(Keys.ENTER);
        driver.navigate().to("http://www.bestbuy.com");
        driver.findElement(By.name("email")).sendKeys("nussab2016@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"emailSubmissionId\"]/div/div[2]/div/input")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement (By.xpath("/html/body")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("gh-search-input")).sendKeys("Laptop's");
        //driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//button[contains@type,'Pro']")).click();
    }
}
