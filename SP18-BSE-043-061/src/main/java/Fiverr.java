import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fiverr {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://stackoverflow.com/");

        Thread.sleep(3000);

        driver.findElement(new By.ByXPath("/html/body/header/div/ol[2]/li[2]/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(new By.ByXPath("//*[@id=\"email\"]")).sendKeys("malikomar353@gmail.com");

        driver.findElement(new By.ByXPath("//*[@id=\"password\"]")).sendKeys("000222aaa");

        Thread.sleep(3000);

        driver.findElement(new By.ByXPath("//*[@id=\"submit-button\"]")).click();

// TO LOGOUT
        Thread.sleep(5000);
        driver.findElement(new By.ByXPath("/html/body/header/div/ol[2]/li[6]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("https://stackoverflow.com/users/logout")).click();
    }
}
