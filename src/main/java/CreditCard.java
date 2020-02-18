public class CreditCard extends PaymentCard {
    private double customerRiskMultiple;
    private double creditLimit;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber, double customerRiskMultiple, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber);
        this.customerRiskMultiple = customerRiskMultiple;
        this.creditLimit = creditLimit;
    }

    public double getTransactionCost(double transactionAmount) {
        return transactionAmount * 0.02 * this.customerRiskMultiple;
    }

    public void charge(double transactionAmount) {
        this.creditLimit -= transactionAmount;
        super.charge(transactionAmount);
    }
}
