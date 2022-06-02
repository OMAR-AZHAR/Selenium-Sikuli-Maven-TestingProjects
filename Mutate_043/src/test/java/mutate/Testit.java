package mutate;

import org.junit.Assert;
import org.junit.Test;
import mutate.Mutate_043;
public class Testit {

    Mutate_043 Tester = new Mutate_043();

    @Test
    public void mutateit(){

        String Big= "222.0";

        String largest=Tester.mutateit();

        Assert.assertEquals(Big,largest);

    }
    @Test
    public void mutateitagain(){

        String Big= "222.0";

        String largest=Tester.mutateit();

        Assert.assertEquals(Big,largest);

    }}


