public class GiftCard implements IChargeable {
    private String vendor;
    private double balance;

    public GiftCard(String vendor, double balance) {
        this.vendor = vendor;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getVendor() {
        return this.vendor;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {
        this.balance -= purchaseAmount;
    }
}
