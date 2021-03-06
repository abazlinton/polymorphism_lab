import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<Double> charges;

    public PaymentCard(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);
    }
}
