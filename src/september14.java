import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class september14 {
    static String requestedUrl="http://www.ebay.com";
      WebDriver driver=new ChromeDriver();
      static WebDriver kaya;


    public static void main(String[] args) {
        chrome();

        System.out.println(validationUrl(requestedUrl));

    }


    public static void chrome(){
        System.setProperty("webdriver.chrome.driver","C:/Users/skaya/Drivers/chromedriver.exe");

        kaya=new ChromeDriver();
        kaya.get(requestedUrl);
    }
    public static boolean validationUrl(String url) {
        boolean result = true;

        System.out.println("Current URL :" + kaya.getCurrentUrl());
        System.out.println("Requested URL:" + url);
        if (url.equals(kaya.getCurrentUrl())) {
        } else {
            return false;
        }
      return result;
    }

}
