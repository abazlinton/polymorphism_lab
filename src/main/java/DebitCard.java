public class DebitCard extends PaymentCard {
    private int sortCode;
    private int accountNumber;

    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public double getTransactionCost(double transactionAmount) {
        return transactionAmount * 0.01;
    }

}
