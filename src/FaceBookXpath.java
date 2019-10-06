import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpath {
    static WebDriver driver;

    public static void main(String[] args) {
               chromeInvocation();
               driver.get("http://www.facebook.com");
               driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sceran_biyoloji@hotmail.com");
    }

    public static void chromeInvocation() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
    }
}
