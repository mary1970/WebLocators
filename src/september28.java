import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class september28 {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver kaya = myBrowser.chromeInvocation();
        kaya.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        kaya.get("http://www.expedia.com");
       kaya.findElement(By.cssSelector("input[for='partialHotelBooking-hp-package']")).click();
        kaya.findElement(By.cssSelector("input[#'partialHotelBooking-hp-package']")).click();

        System.out.println("The checkbox:" + kaya.findElement(By.cssSelector("input[#'partialHotelBooking-hp-package']")).isSelected());


    }
}
