import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class babySitterTests {

    private final int bedTime = 8;

    BabySitter babySitter;
    @Before
    public void setUp(){
        babySitter = new BabySitter();
    }

    @Test
    public void workFrom5To9ShouldGet44DollarsPay(){
        assertEquals(44, babySitter.moneyEarnedForShift(5, 9, bedTime));
    }

}
