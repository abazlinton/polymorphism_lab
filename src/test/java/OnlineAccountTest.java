import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {
    private OnlineAccount onlineAccount;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private LoyaltyCard loyaltyCard;
    private Ticket ticket;
    private PaymentCard paymentCard;

    @Before()
    public void before(){
        onlineAccount = new OnlineAccount("Isa's OnlineAccount");
        creditCard = new CreditCard("1111222233334444", "12/23", 234, 1.1);
        debitCard = new DebitCard("1111222233334444", 909090, 12345678, "12/23", 234);
        loyaltyCard = new LoyaltyCard("123456787890", "Harrid's Stores");
        paymentCard = new CreditCard("1111222233334444", "12/23", 234, 1.2);
    }

    @Test
    public void canGetWalletName() {
        assertEquals("Isa's OnlineAccount", onlineAccount.getName());
    }

    @Test
    public void walletStartsEmpty() {
        assertEquals(0, onlineAccount.getNumberOfPaymentMethods());
    }

    @Test
    public void canAddCreditCardToWallet() {
        onlineAccount.addPaymentMethod(creditCard);
        assertEquals(1, onlineAccount.getNumberOfPaymentMethods());
    }

    @Test
    public void canAddDebitCardToWallet() {
        onlineAccount.addPaymentMethod(debitCard);
        assertEquals(1, onlineAccount.getNumberOfPaymentMethods());
    }

    @Test
    public void canAddCreditCardAsPaymentCardToWallet() {
        onlineAccount.addPaymentMethod(paymentCard);
        assertEquals(1, onlineAccount.getNumberOfPaymentMethods());
    }

    @Test
    public void canAddDebitCardAsPaymentCardToWallet() {
        paymentCard = new DebitCard("1111222233334444", 909090, 12345678, "12/23", 234);
        onlineAccount.addPaymentMethod(paymentCard);
        assertEquals(1, onlineAccount.getNumberOfPaymentMethods());
    }

    @Test
    public void canAddLoyaltyCardToWallet() {
        onlineAccount.addPaymentMethod(loyaltyCard);
        assertEquals(1, onlineAccount.getNumberOfPaymentMethods());
    }


    @Test
    public void canAddEverythingToWallet() {
        onlineAccount.addPaymentMethod(creditCard);
        onlineAccount.addPaymentMethod(debitCard);
        onlineAccount.addPaymentMethod(loyaltyCard);
        assertEquals(3, onlineAccount.getNumberOfPaymentMethods());
    }

    @Test
    public void canScanCreditCard() {
        onlineAccount.addPaymentMethod(creditCard);
        String result = onlineAccount.scanItem(0);
        assertEquals("Payment Successful", result);
    }

    @Test
    public void canScanPaymentCard() {
        onlineAccount.addPaymentMethod(paymentCard);
        String result = onlineAccount.scanItem(0);
        assertEquals("Payment Successful", result);
    }

    @Test
    public void canScanDebitCard() {
        onlineAccount.addPaymentMethod(debitCard);
        String result = onlineAccount.scanItem(0);
        assertEquals("Payment Complete", result);
    }

    @Test
    public void canScanLoyaltyCard() {
        onlineAccount.addPaymentMethod(loyaltyCard);
        String result = onlineAccount.scanItem(0);
        assertEquals("123456787890", result);
    }

    @Test
    public void canScanTicket() {
        onlineAccount.addPaymentMethod(ticket);
        String result = onlineAccount.scanItem(0);
        assertEquals("QWERTY123456", result);
    }

    @Test
    public void canScanIndividualItem() {
        onlineAccount.addPaymentMethod(creditCard);
        onlineAccount.addPaymentMethod(debitCard);
        onlineAccount.addPaymentMethod(loyaltyCard);
        onlineAccount.addPaymentMethod(ticket);

        String result = onlineAccount.scanItem(1);
        assertEquals("Payment Complete", result);
    }
}
