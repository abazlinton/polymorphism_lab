public class CreditCard extends PaymentCard {
    private double customerRiskMultiplier;

    private double creditLimit;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber, double customerRiskMultiplier, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber);
        this.customerRiskMultiplier = customerRiskMultiplier;
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getTransactionCost(double transactionAmount) {
        return transactionAmount * 0.02 * this.customerRiskMultiplier;
    }

    public void charge(double transactionAmount) {
        this.creditLimit -= transactionAmount;
        super.charge(transactionAmount);
    }
}
