public class LoyaltyCard implements IChargeable {
    private String vendor;
    private double balance;

    public LoyaltyCard(String vendor, double balance) {
        this.vendor = vendor;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getVendor() {
        return this.vendor;
    }

    public double getTransactionCost(double transactionAmount) {
        return 0;
    }

    public void charge(double transactionAmount) {
        this.balance -= transactionAmount;
    }
}
