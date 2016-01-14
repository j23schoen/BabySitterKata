import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class babySitterTests {

    private final int bedTime = 8;

    @Test
    public void workFrom5To9ShouldGet44DollarsPay(){
        BabySitter babySitter = new BabySitter(5, 9, bedTime);
        assertEquals(44, babySitter.moneyEarnedForShift());
    }

    @Test
    public void workFrom5To12ShouldGet68DollarsPay(){
        BabySitter babySitter = new BabySitter(5, 12, bedTime);
        assertEquals(68, babySitter.moneyEarnedForShift());
    }

    @Test
    public void workFrom9To12ShouldGetDollarsPay(){
        BabySitter babySitter = new BabySitter(9, 12, bedTime);
        assertEquals(24, babySitter.moneyEarnedForShift());
    }

    @Test
    public void workFrom12To16ShouldGet64DollarsPay(){
        BabySitter babySitter = new BabySitter(12, 16, bedTime);
        assertEquals(64, babySitter.moneyEarnedForShift());
    }

    @Test
    public void workFrom5To16ShouldGet132DollarsPay(){
        BabySitter babySitter = new BabySitter(5, 16, bedTime);
        assertEquals(132, babySitter.moneyEarnedForShift());
    }

    @Test
    public void workFrom5To8ShouldGet36DollarsPay(){
        BabySitter babySitter = new BabySitter(5, 8, bedTime);
        assertEquals(36, babySitter.moneyEarnedForShift());
    }
}
