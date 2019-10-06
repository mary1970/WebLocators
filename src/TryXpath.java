import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryXpath {
    static WebDriver kaya;

    public static void main(String[] args)throws InterruptedException {
        chrome();
        Thread.sleep(5000);
        kaya.findElement(By.xpath("//*[@id='hypeCookieDiv']/a[1]")).click();
        Thread.sleep(5000);
        kaya.findElement(By.xpath("//*[@id='fligth-searh']/div[1]/div[1]/div/div[2]/div/label")).click();


    }


             public static void chrome() {
               System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
                kaya = new ChromeDriver();
              kaya.get("http://flypgs.com");
        }
    }

