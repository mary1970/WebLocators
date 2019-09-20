import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationPages {



    public static void main(String[] args) {
        chrome();

    }

    public static void  chrome() {
        WebDriver kaya;

        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
        kaya = new ChromeDriver();

        kaya.get("http://amazon.com");

        kaya.get("http://ebay.com");

        kaya.navigate().back();
        kaya.navigate().forward();
        kaya.navigate().to("http://ebay.com");
        System.out.println("******************************************");
        kaya.close();


    }
}