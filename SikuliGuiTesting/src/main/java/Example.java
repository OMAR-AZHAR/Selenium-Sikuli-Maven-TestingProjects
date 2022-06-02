import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.event.KeyEvent;
import java.util.Random;


public class Example {

    public static final Pattern MUSIC = new Pattern(Example.class.getResource("music.PNG"));
    public static final Pattern NEW_FOLDER = new Pattern(Example.class.getResource("new_folder.PNG"));


    public static void main(String[] args) throws FindFailed {
        Screen s = new Screen();

        s.keyDown(KeyEvent.VK_WINDOWS);
        s.keyDown(KeyEvent.VK_E);
        s.keyUp(KeyEvent.VK_WINDOWS);
        s.keyUp(KeyEvent.VK_E);

        s.wait(MUSIC.similar((float) 0.90), 2).click();
        s.wait(NEW_FOLDER.similar((float) 0.90), 2).click();

        Random rand = new Random();
        s.type("Sikuli Automation " + rand.nextInt(10));
        s.keyDown(KeyEvent.VK_ENTER);
        s.keyUp(KeyEvent.VK_ENTER);
    }
}
