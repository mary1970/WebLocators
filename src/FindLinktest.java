import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinktest {
    public static WebDriver driver;
    public static void main(String[] args)throws InterruptedException {
        firefox();
        driver.findElement(By.name("session[username_or_email]")).sendKeys("sabire");
        Thread.sleep(1000);
        driver.findElement(By.name("session[password]")).sendKeys("ceran");
       Thread.sleep(1000);



    }
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\skaya\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("http://www.twitter.com");

    }

}
