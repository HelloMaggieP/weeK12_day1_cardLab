import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard("Monzo", 200.00);
    }

    @Test
    public void hasCardName() {
        assertEquals("Monzo", creditCard.getCardName());
    }

    @Test
    public void canGetTransactionFee() {
        assertEquals(0.80, creditCard.getTransactionFee(8), 0.01);
    }

    @Test
    public void canAddToChargesArrayList() {
        this.creditCard.charge(8);
        assertEquals(1, creditCard.getChargesSize());
        assertEquals(192.00, creditCard.getLimit(), 0.01);
    }

}
