import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrl {
    public static String requestedUrl="http://www.amazon.com";
    WebDriver driver=new ChromeDriver();
    public static WebDriver kaya;
    public static void main(String args[]){
        chrome();
        boolean result=urlValidation(requestedUrl);
        System.out.print("Validation: "+result);
    }

    public static void chrome(){
        System.setProperty("webdriver.chrome.driver","C:/Users/skaya/Drivers/chromedriver.exe");
         kaya=new ChromeDriver();
        kaya.get(requestedUrl);
    }



    public static boolean urlValidation(String url){
        System.out.println("Current Url: "+kaya.getCurrentUrl());
        System.out.println("Requested Url: "+url);
        if(url.equals(kaya.getCurrentUrl()))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
