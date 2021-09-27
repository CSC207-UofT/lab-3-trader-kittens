import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow(10);
    }

    @Test(timeout = 50)
    public void TestPrice() {
        assertEquals(400, c.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

}
