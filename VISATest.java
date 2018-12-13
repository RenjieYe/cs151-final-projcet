package cs151hw4ry;

import static org.junit.Assert.*;

import org.junit.Test;

public class VISATest {

    @Test
    public void testIsVISA_True() {
        assertTrue(VISA.validate("4123456789012"));
    }

    @Test
    public void testIsVISA_False() {
        assertFalse(VISA.validate("1123456789012"));
    }

}
