import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {
    private OnlineAccount onlineAccount;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private GiftCard giftCard;
    private ReportingSoftware reportingSoftware;

    @Before()
    public void before(){
        reportingSoftware = new ReportingSoftware();
        creditCard = new CreditCard("1111222233334444", "12/23", 234, 1.1, 1000);
        debitCard = new DebitCard("1111222233334444", 909090, 12345678, "12/23", 234);
        giftCard = new GiftCard("123456787890", 1000);
        onlineAccount = new OnlineAccount("Amazon", reportingSoftware);
    }

    @Test
    public void canGetName() {
        assertEquals("Amazon", onlineAccount.getName());
    }

    @Test
    public void startsWithNoPaymentMethods() {
        assertEquals(0, onlineAccount.getNumberOfPaymentMethods());
    }


    @Test
    public void canAddPaymentMethodsToAccount() {
        onlineAccount.addPaymentMethod(creditCard);
        onlineAccount.addPaymentMethod(debitCard);
        onlineAccount.addPaymentMethod(giftCard);
        assertEquals(3, onlineAccount.getNumberOfPaymentMethods());
    }

    @Test
    public void canChargeCustomer(){
        onlineAccount.addPaymentMethod(creditCard);
        onlineAccount.chargeCustomer(100, 0);
        assertEquals(1, reportingSoftware.getNumberOfTransactionCosts());
        assertEquals(900, creditCard.getCreditLimit(), 0.01);
    }

}
