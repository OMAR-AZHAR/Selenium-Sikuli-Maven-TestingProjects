import org.sikuli.script.*;

import java.awt.event.KeyEvent;
import java.util.Random;

public class Sikuli_A {
    public static final Pattern download = new Pattern(Sikuli_A.class.getResource("down.PNG"));
    public static final Pattern landImage = new Pattern(Sikuli_A.class.getResource("land.jpg"));
    public static final Pattern Min = new Pattern(Sikuli_A.class.getResource("Min.png"));
    public static final Pattern Picture = new Pattern(Sikuli_A.class.getResource("picture.png"));

    public static void main(String[] args) throws FindFailed {
        Screen s = new Screen();

        s.wait(download.similar((float) 0.90), 2).click();
       // s.wait(landImage.similar((float) 0.90), 2).click();


        App.focus("explorer.exe" + download + landImage);
        s.wait(landImage.similar((float) 0.90), 2);
        s.click(Min);
        s.find(landImage);

       s.keyDown(Key.CTRL + "c");
      App.open("explorer.exe" + Picture);
        s.keyDown(Key.CTRL + "v");



    }
}
