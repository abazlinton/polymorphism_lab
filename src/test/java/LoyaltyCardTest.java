import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoyaltyCardTest {
    private LoyaltyCard loyaltyCard;

    @Before
    public void before() {
        loyaltyCard = new LoyaltyCard("Amazon", 1000);
    }

    @Test
    public void canGetVendor() {
        assertEquals("Amazon", loyaltyCard.getVendor());
    }

    @Test
    public void canChargeCard() {
        loyaltyCard.charge(100);
        assertEquals(900, loyaltyCard.getBalance(), 0.01);
    }

    @Test
    public void canGetTransactionCostIsZero(){
        double transactionCost = loyaltyCard.getTransactionCost(100);
        assertEquals(0, transactionCost, 0.01);
    }
}


