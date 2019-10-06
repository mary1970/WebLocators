import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    static WebDriver kaya;
    public static void main(String[] args) throws InterruptedException {
        chrome();
            kaya.findElement(By.id("global-search-input")).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            kaya.findElement(By.id("global-search-input")).sendKeys("milk");
            Thread.sleep(2000);

    }
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
        kaya=new ChromeDriver();
        kaya.get("http://www.wallmart.com");
    }
}
