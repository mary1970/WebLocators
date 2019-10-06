import com.sun.jdi.ByteValue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class XpathPseudocode {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver kaya = myBrowser.chromeInvocation();
        kaya.get("http://www.expedia.com");
        Thread.sleep(2000);
        kaya.findElement(By.xpath("//*[@class='cols-row']/div/ul/li[8]/a")).click();
        Thread.sleep(2000);
        Thread.sleep(2000);
        kaya.findElement(By.id("VR-destination")).sendKeys("Houston");
        Thread.sleep(2000);
        kaya.findElement(By.id("VR-fromDate")).sendKeys("10/12/2019");
        Thread.sleep(2000);
        for (int i=0;i<11;i++) {
            kaya.findElement(By.id("VR-toDate")).sendKeys(Keys.BACK_SPACE);
            Thread.sleep(1000);
        }
       kaya.findElement(By.id("VR-toDate")).sendKeys("10/15/2019");
        Thread.sleep(2000);
        kaya.findElement(By.xpath("//*[@id='VR-toDate-label']/div/div/div[1]/button")).click();
        Thread.sleep(2000);
        kaya.findElement(By.xpath("//*[@id='VR-searchButtonExt1']")).click();
        Thread.sleep(2000);
        kaya.findElement(By.xpath("//*[@class='uitk-button-text']//ancestor::nav")).click();
        Thread.sleep(1000);
         kaya.findElement(By.id("primary-header-cruise")).click();
         kaya.quit();
    }
}
