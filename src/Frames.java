import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("http://www.jqueryui.com/droppable");
        //WebDriverWait wait= new WebDriverWait(kaya,60);
        Thread.sleep(2000);
        kaya.switchTo().frame(kaya.findElement(By.cssSelector("#content > iframe")));
        Thread.sleep(2000);
        Actions setOfActions=  new Actions(kaya);
        Thread.sleep(2000);
        WebElement source=kaya.findElement(By.id("draggable"));
        WebElement target=kaya.findElement(By.id("droppable"));
        setOfActions.dragAndDrop(source,target).build().perform();



    }
}
