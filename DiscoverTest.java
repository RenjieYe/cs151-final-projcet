package cs151hw4ry;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoverTest {

    @Test
    public void testIsDiscover_True() {
        assertTrue(Discover.validate("6011123456789012"));
    }

    @Test
    public void testIsDiscover_False() {
        assertFalse(Discover.validate("1111123456789012"));
    }

}
