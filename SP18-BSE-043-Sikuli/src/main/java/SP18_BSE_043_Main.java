import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SP18_BSE_043_Main {

    public static void main(String[] args) throws InterruptedException, FindFailed {

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.intel.com/content/www/us/en/homepage.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       Screen screen = new Screen();
        Pattern imageSearch = new Pattern("src/main/resources/search.jpg");
        screen.wait(imageSearch, 20);
        screen.click(imageSearch);
        screen.type("Core 10");
        Thread.sleep(200);
        screen.type(Key.ENTER);
        Thread.sleep(2000);
      //  screen.wait(imageSearch.similar((float) 0.90), 2).click();
        // To Click 10 generation processors details
        Pattern imageSearch2 = new Pattern("src/main/resources/10Gen.jpg");
        screen.wait(imageSearch2, 20);
        screen.click(imageSearch2);
        Thread.sleep(200);

// TO check 10GEN xps specifications
        Pattern imageSearch3 = new Pattern("src/main/resources/dellxps.jpg");
        screen.wait(imageSearch3, 20);
        screen.click(imageSearch3);
        Thread.sleep(200);

    }
}
