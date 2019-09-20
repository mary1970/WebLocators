import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocator {


    static String url = "http://www.skyscanner.com";
    static WebDriver kaya;

    public static void main(String[] args) {
        chrome();
        kaya.get(url);

        kaya.findElement(By.id("fsc-origin-search")).clear();
        kaya.findElement(By.id("fsc-origin-search")).sendKeys("Washington");
        kaya.findElement(By.id("fsc-destination-search")).sendKeys("London");


    }

    public static void chrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
        kaya = new ChromeDriver();
        kaya.get(url);
    }
}
