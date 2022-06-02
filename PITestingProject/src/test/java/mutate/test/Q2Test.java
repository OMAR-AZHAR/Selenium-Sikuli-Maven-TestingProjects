package mutate.test;
import mutate.Q2;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Q2Test {
    Q2 obj = new Q2();

    @Test
    public void test2() {
        assertEquals("You are eligible to donate blood", obj.questionr());
    }
}
