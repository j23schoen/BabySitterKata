import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class babySitterTests {

    private final int bedTime = 8;



    @Test
    public void workFrom5To9ShouldGet44DollarsPay(){
        BabySitter babySitter = new BabySitter(5, 9, bedTime);
        assertEquals(44, babySitter.moneyEarnedForShift());
    }

}
