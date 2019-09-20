import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sep14Firefox {
    static String urlrequested="http://www.netflix.com";
    static WebDriver kaya;

    public static void main(String[] args) {
        firefox(urlrequested);
        boolean result= validationUrl(urlrequested);
        System.out.println(result);
    }
    public static void firefox(String urlrequested) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\skaya\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
         kaya=new FirefoxDriver();
        kaya.get("http://www.netflix.com");
    }
    public static boolean validationUrl(String url){
        boolean result=false;
        System.out.println("The Current URL :"+url);
        System.out.println("the request URL :"+kaya.getCurrentUrl());
        if ( url.equals(kaya.getCurrentUrl())){
            result=true;
        }
        else{
            result=false;
        }
        return result;
    }
}
