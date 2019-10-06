import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath2September {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("http://www.echoecho.com/htmlforms10.htm");
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(1000);
        kaya.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(1000);
        int count=kaya.findElements(By.cssSelector("input[type='radio']")).size();
        Thread.sleep(2000);
        System.out.println("The Number of Radio Element:"+count);
        for (int i=0;i<=count;i++){
            kaya.findElements(By.cssSelector("input[type='radio']")).size();
            Thread.sleep(1000);
        }
}

}
