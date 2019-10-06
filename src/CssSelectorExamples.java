import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssSelectorExamples {
   static  WebDriver driver;
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        driver = myBrowser.chromeInvocation();
        driver.get("http://www.amazon.com");
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("it is me!");
        driver.navigate().to("http://www.facebook.com");

    }

}
