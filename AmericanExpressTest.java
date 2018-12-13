package cs151hw4ry;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanExpressTest {

    @Test
    public void testIsAmericanExpress_True() {
        assertTrue(AmericanExpress.validate("341234567890123"));
    }

    @Test
    public void testIsAmericanExpress_False() {
        assertFalse(AmericanExpress.validate("441234567890123"));
    }

}
