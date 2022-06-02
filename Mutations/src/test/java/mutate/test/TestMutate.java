
package mutate.test;

import mutate.ToBeTested;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMutate {

    ToBeTested toBeTested = new ToBeTested();

    @Test
    public void display() {
        int a = 9;
        int b = 8;
        int c = 7;
        int d = a + b + c + 1;
        int res = toBeTested.display();
        Assert.assertEquals(d, res);

    }
}
