import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindInstagram {
    static WebDriver kaya;
    public static void main(String[] args)throws InterruptedException {
        chrome();
        kaya.get("http://www.instagram.com");
        kaya.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[1]/button")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
      //  kaya.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[7]/div/button")).sendKeys(Keys.ENTER);

         kaya.findElement(By.name("emailOrPhone")).sendKeys("3647934091");
        kaya.findElement(By.name("fullName")).sendKeys("Mary");
        kaya.findElement(By.name("username")).sendKeys("Ceran");
        kaya.findElement(By.name("password")).sendKeys("1970..");



    }
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
        kaya=new ChromeDriver();
    }
}
