import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    private GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard("Amazon", 1000);
    }

    @Test
    public void canGetVendor() {
        assertEquals("Amazon", giftCard.getVendor());
    }

    @Test
    public void canChargeCard() {
        giftCard.charge(100);
        assertEquals(900, giftCard.getBalance(), 0.01);
    }

    @Test
    public void canGetTransactionCostIsZero(){
        double transactionCost = giftCard.getTransactionCost(100);
        assertEquals(0, transactionCost, 0.01);
    }
}


