import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTheWindows {
    public static void main(String[] args) {
        Browser myBrowser=new Browser();
        WebDriver kaya=myBrowser.chromeInvocation();
        kaya.get("https//:account.google.com.signup");
        WebDriverWait wait=new WebDriverWait(kaya,10);


    }
}
