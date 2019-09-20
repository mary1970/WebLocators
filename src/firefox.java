import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class firefox {
    public static void main(String[] args) {
        firefox();
       chrome();

    }

    private static void chrome() {
        System.setProperty("webdriver.chrome.driver","C:/Users/skaya/Drivers/chromedriver.exe");
        WebDriver kaya=new ChromeDriver();
        kaya.get("http://www.amazon.com");
    }

    public static void firefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\skaya\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.ebay.com");
    }

}