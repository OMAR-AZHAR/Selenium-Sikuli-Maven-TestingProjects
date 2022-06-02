import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.image.BufferedImage;

/*
 * OTAR Services
 * author: Taimoor Hassan
 * 11/10/2020 3:52 PM
 * PACKAGE_NAME
 */
public class SikuliTestExample1 {

    @Test
    public void openFileTest() throws FindFailed, InterruptedException {
        // TODO Auto-generated method stub
        Screen s = new Screen();
        String path = "E:\\SampleProjects\\file.PNG";
        Pattern target = new Pattern(path);
        ImagePath.setBundlePath(path);
        System.out.println(ImagePath.getBundlePath());

        s.find(ImagePath.setBundlePath(path));
        s.click(ImagePath.setBundlePath(path));
        System.out.println("File icon clicked");

    }
}
