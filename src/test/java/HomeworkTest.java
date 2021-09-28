import org.junit.*;

import static org.junit.Assert.*;


public class HomeworkTest {
    Homework m;

    @Before
    public void setUp() throws Exception {
        m = new Homework();
    }

//    Test whether Homework makes the right sound
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Moooow!", m.sound());
    }

//    Test whether Homework has the right price
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5000, m.getPrice());
    }

}