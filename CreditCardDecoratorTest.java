package cs151hw4ry;

import static org.junit.Assert.*;

import org.junit.Test;

class MockCreditCard extends CreditCard {
    public MockCreditCard(String creditCardNum) {
        super(creditCardNum);
    }

    public boolean validate() {
        return true;
    }
}

public class CreditCardDecoratorTest {

    @Test
    public void testExpiredCard() {
        CreditCardDecorator instance = new CreditCardDecorator(new MockCreditCard("123"), "01/18");
        assertFalse(instance.validate());
    }

    @Test
    public void testValidCard() {
        CreditCardDecorator instance = new CreditCardDecorator(new MockCreditCard("123"), "01/22");
        assertTrue(instance.validate());
    }

    @Test
    public void testInvalidDateFormatCard() {
        CreditCardDecorator instance = new CreditCardDecorator(new MockCreditCard("123"), "invalid");
        assertFalse(instance.validate());
    }

}
