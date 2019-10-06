import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcpilitWait {
    public static void main(String[] args) {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("http://www.amazon.com");
        WebDriverWait wait=new WebDriverWait(kaya,5);
        WebElement myelement=kaya.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
        wait.until(ExpectedConditions.visibilityOf(myelement));
        Actions myAction= new Actions(kaya);
        myAction.moveToElement(myelement).click().perform();
        myAction.moveToElement(kaya.findElement(By.id("twotabsearchtextbox"))).click().perform();
        myAction.sendKeys("Text Book").click().perform();
    }
}
