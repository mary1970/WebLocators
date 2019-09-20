import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_IaaiSearch {
    public static WebDriver kaya;

    public static void main(String[] args) throws InterruptedException {
        chrome();
        kaya.findElement(By.id("txtSearch")).sendKeys("LEXUS");
        Thread.sleep(1000);
        kaya.findElement(By.id("txtSearch")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        kaya.findElement(By.id("txtSearch")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        kaya.findElement(By.id("txtSearch")).sendKeys(Keys.ENTER);
        kaya.findElement(By.id("txtSearch")).getAttribute("placeholder");
        System.out.println(kaya.findElement(By.id("txtSearch")).getAttribute("placeholder"));
        kaya.navigate().to("http://www.amazon.com");
        System.out.println("Text:"+kaya.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).getText());

    }
    public static void chrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
        kaya = new ChromeDriver();
        kaya.get("http://www.iaai.com");
    }
}
