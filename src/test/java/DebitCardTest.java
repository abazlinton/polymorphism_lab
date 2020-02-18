import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    private DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard("1111222233334444", 909090, 12345678, "12/23", 234);
    }

    @Test
    public void canGetCardNumber() {
        assertEquals("1111222233334444", debitCard.getCardNumber());
    }

    @Test
    public void canGetSortCode() {
        assertEquals(909090, debitCard.getSortCode());
    }

    @Test
    public void canGetAccountNumber() {
        assertEquals(12345678, debitCard.getAccountNumber());
    }

    @Test
    public void canGetExpiryDate() {
        assertEquals("12/23", debitCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber() {
        assertEquals(234, debitCard.getSecurityNumber());
    }

    @Test
    public void canGetTransactionCostIs1Percent(){
        double transactionCost = debitCard.getTransactionCost(100);
        assertEquals(1, transactionCost, 0.01);
    }


}
