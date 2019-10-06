import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAttribute {
    static WebDriver driver;
    public static void main(String[] args) {
        chrome();
        //It is not working because of there is a space in classname keyword.
        //driver.get("http://www.skyscanner.com");
        //driver.findElement(By.className("HeaderTab_HeaderTab__text___djus HeaderTab_HeaderTab__text--small__2czAh")).click();
        driver.get("http://www.turkishairlines.com");
        driver.findElement(By.className("thyHeaderLink")).click();

    }
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
        driver=new ChromeDriver();


    }
}
