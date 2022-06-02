import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        Thread.sleep(3000);
        driver.findElement(By.name("login")).click();
    }
}