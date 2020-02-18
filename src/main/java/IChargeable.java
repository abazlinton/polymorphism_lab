public interface IChargeable {
    double getTransactionCost(double purchaseAmount);
    void charge(double purchaseAmount);
}
