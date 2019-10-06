import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CapitalLetterWithActionClass {
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver kaya = myBrowser.chromeInvocation();
        kaya.get("http://www.instagram.com");
        kaya.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions myAction=new Actions(kaya);
        WebElement myWebElement = kaya.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[1]/button"));
        Action mynewAct=myAction.moveToElement(myWebElement).click().build();
          mynewAct.perform();
          WebElement newmyWebElement= kaya.findElement(By.xpath("//*[@id='email']"));
        Action myAct=myAction.moveToElement(newmyWebElement)
                .click()
                .keyDown(newmyWebElement,Keys.SHIFT)
                .sendKeys("Sabire")
                .keyUp(newmyWebElement,Keys.SHIFT)
                .build();
              myAct.perform();


    }
}

