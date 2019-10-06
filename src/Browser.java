import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class Browser {
    public static void main(String[] args) {

    }
    public WebDriver chromeInvocation(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/skaya/Drivers/chromedriver.exe");
        WebDriver kaya=new ChromeDriver();
           return kaya;
    }
    public WebDriver firefoxInvocation(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\skaya\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        WebDriver ceran=new FirefoxDriver();
        return ceran;
    }

}
