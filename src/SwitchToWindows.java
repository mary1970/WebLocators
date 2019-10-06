import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToWindows {
    public static void main(String[] args) {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("https://accounts.google.com/signup");
        WebDriverWait wait= new WebDriverWait(kaya,20);
        kaya.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[3]/a")).click();
    }
}
