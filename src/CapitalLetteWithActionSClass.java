import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CapitalLetteWithActionSClass {
    public static void main(String[] args) {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("http://www.facebook.com");
        kaya.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions myActions=new Actions(kaya);
        WebElement mywebElement= kaya.findElement(By.xpath("//*[@id='email']"));
        myActions.moveToElement(mywebElement).click().build().perform();
        myActions.keyDown(mywebElement, Keys.SHIFT).build().perform();
        myActions.sendKeys("Sabire").build().perform();
        myActions.keyUp(mywebElement,Keys.SHIFT).build().perform();

    }
}
