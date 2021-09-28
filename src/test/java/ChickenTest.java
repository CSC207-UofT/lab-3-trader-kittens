import org.junit.*;

import static org.junit.Assert.*;

public class ChickenTest {
    Chicken c;

    @Before
    public void setUp() throws Exception {
        c = new Chicken();
    }

    /**
     * Test if the sound of Chicken matches "Woo-Woo."
     */
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woo-Woo!", c.sound());
    }

    /**
     * Test if the price of Chicken is 5.
     */
    @Test(timeout = 50)
    public void testGetPrice() {
        assertEquals(5, c.getPrice());
    }

}
