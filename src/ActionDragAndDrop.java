import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop {
    private static Object WebDriverWait;

    public static void main(String[] args) {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("http://demo.guru99.com/test/drag_drop.html");
        WebDriverWait wait =new WebDriverWait(kaya,10);
        Actions myActions=new Actions(kaya);
        WebElement source= kaya.findElement(By.cssSelector("#credit2 > a"));
        WebElement target= kaya.findElement(By.className("placeholder"));
        myActions.dragAndDrop(source,target).build().perform();

    }

}
