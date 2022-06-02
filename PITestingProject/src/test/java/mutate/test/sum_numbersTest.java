package mutate.test;
import mutate.sum_numbers;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class sum_numbersTest {
    sum_numbers sum_it = new sum_numbers();

    @Test

    public void test1() {
        assertEquals(8, sum_it.sum(2,5,1));
    }
}
