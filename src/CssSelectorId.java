import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {
    public static void main(String[] args)throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("http://www.expedia.com");
        kaya.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
        Thread.sleep(2000);
        for (int i=0;i<4;i++) {
            Thread.sleep(1000);
            kaya.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        }
        kaya.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("#package-destination-hp-package")).sendKeys("Las-Vegas");
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("#package-departing-hp-package")).sendKeys("9/27/2019");
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("#package-returning-hp-package")).click();
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("label[for='packageDirectFlight-hp-package']")).click();
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).click();
        Thread.sleep(1000);
        for(int i=0;i<3;i++) {
            kaya.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(1000);
        }
        kaya.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("#search-button-hp-package")).click();

    }
}
