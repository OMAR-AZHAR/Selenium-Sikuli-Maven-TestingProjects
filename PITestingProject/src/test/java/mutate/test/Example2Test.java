package mutate.test;

import mutate.Example2;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Example2Test {
    Example2 example2 = new Example2();

    @Test

    public void testOne() {
        assertEquals("foo", example2.getSomething(1));
    }

    @Test
    public void testMinusOne() {
        assertEquals("bar", example2.getSomething(-1));
    }
    @Test
    public void testZero() {
        assertEquals("bar", example2.getSomething(0));
    }

}
