import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserCall {
    public static void main(String[] args)throws InterruptedException {
       Browser myBrowser=new Browser();
        //WebDriver driver=myBrowser.chromeInvocation();
        WebDriver driver=myBrowser.firefoxInvocation();
        driver.get("http://www.instagram.com");
        Thread.sleep(2000);
        driver.findElement(By.name("emailOrPhone")).sendKeys("9548021561");
        Thread.sleep(2000);
        driver.findElement(By.name("fullName")).sendKeys("Mary Kaya");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("BiologisT");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Kaya1970.");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ type='submit']")).click();
        Thread.sleep(2000);

    }
}
