public interface IChargeable {
    double getTransactionCost(double transactionAmount);
    void charge(double transactionAmount);
}
