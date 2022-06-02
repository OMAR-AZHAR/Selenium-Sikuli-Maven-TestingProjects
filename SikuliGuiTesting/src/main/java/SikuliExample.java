import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikuliExample {
    public static final Pattern COLOR1 = new Pattern("src/main/resources/1398665726055.PNG");
    public static final Pattern COLOR2 = new Pattern("src/main/resources/1398666382715.PNG");
    public static final Pattern COLOR3 = new Pattern("src/main/resources/1398666248846.PNG");
    public static final Pattern B = new Pattern("src/main/resources/b.PNG");
    public static final Pattern R = new Pattern("src/main/resources/R.PNG");
    public static final Pattern G = new Pattern("src/main/resources/g.PNG");
    public static final Pattern LB = new Pattern("src/main/resources/lb.PNG");
    public static final Pattern P = new Pattern("src/main/resources/p.PNG");
    public static final Pattern BLACK = new Pattern("src/main/resources/black.PNG");
    public static final Pattern BROWN = new Pattern("src/main/resources/brown.PNG");
    public static final Pattern PINK = new Pattern("src/main/resources/pink.PNG");
    public static final Pattern LG = new Pattern("src/main/resources/lg.PNG");


    public static void main(String[] args) throws FindFailed, InterruptedException {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(2000);

        driver.get("http://www.thecolor.com/Coloring/a-puppy-with-a-kitten.aspx");
        Screen screen = new Screen();
        screen.wait(COLOR1.similar((float) 0.90), 20);
        screen.click(COLOR2.similar((float) 0.90));
        screen.click(COLOR3.similar((float) 0.90));
        screen.click(R);
        screen.click(G);
        screen.click(B);
        screen.click(P);
        screen.click(LB);
        screen.click(BLACK);
        screen.click(PINK);
        screen.click(BROWN);
        screen.waitVanish(LG.similar((float) 0.90));
    }
}
