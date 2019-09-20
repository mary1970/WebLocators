import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebElementLocatorID2 {
    public static WebDriver kaya;


    public static void main(String[] args) throws InterruptedException {
       firefox();
       kaya.findElement(By.id("package-origin-hp-package")).sendKeys("H");
       Thread.sleep(1000);
       kaya.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       kaya.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       kaya.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       kaya.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
       Thread.sleep(1000);
       kaya.findElement(By.id("package-destination-hp-package")).sendKeys("M");
       Thread.sleep(1000);
       kaya.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       kaya.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       kaya.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ENTER);
       Thread.sleep(2000);
        //kaya.findElement(By.id("package-destination-hp-package")).clear();
      // Thread.sleep(2000);
        kaya.findElement(By.id("package-departing-hp-package")).sendKeys("1/10/2020");
        Thread.sleep(1000);
        kaya.findElement((By.id("package-returning-hp-package"))).sendKeys("1/25/2020");
        Thread.sleep(1000);
       // for(int i=1;i<11;i++) {
        kaya.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.chord(Keys.CONTROL,"A"));
            kaya.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.BACK_SPACE);
        //}
        kaya.findElement(By.id("package-returning-hp-package")).sendKeys("1/26/2020");
        kaya.findElement(By.id("package-returning-hp-package")).click();
        kaya.findElement(By.id("search-button-hp-package")).sendKeys(Keys.ENTER);

    }
    public static void firefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\skaya\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
        kaya = new FirefoxDriver();
        kaya.get("http://www.expedia.com");
    }
}
