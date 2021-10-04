import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard("RBS");
    }

    @Test
    public void hasCardName() {
        assertEquals("RBS", debitCard.getCardName());
    }

    @Test
    public void canGetTransactionFee() {
        assertEquals(0.16, debitCard.getTransactionFee(8), 0.01);
    }

    @Test
    public void canAddToChargesArrayList() {
        this.debitCard.charge(8);
        assertEquals(1, debitCard.getChargesSize());
    }
}
