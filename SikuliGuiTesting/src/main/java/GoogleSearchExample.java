import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class GoogleSearchExample {
    public static void main(String[] args) throws InterruptedException, FindFailed {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
      //  driver.get("http://www.google.com");
        driver.get("https://www.intel.com/content/www/us/en/homepage.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

  /*      Screen screen = new Screen();
        Pattern imageSearch = new Pattern("src/main/resources/intel.png");
        screen.wait(imageSearch, 20);
        screen.click(imageSearch);
        screen.type("Introduction to Sikuli");
        Thread.sleep(2000);
        screen.type(Key.ENTER);
        Thread.sleep(2000); */

        // Close the browser
//        driver.quit();
    }
}
