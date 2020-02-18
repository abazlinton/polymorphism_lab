import java.util.ArrayList;

public class OnlineAccount {
    private String name;
    private ArrayList<IChargeable> paymentMethods;

    public OnlineAccount(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<IChargeable>();
    }

    public String getName() {
        return name;
    }

    public void addPaymentMethod(IChargeable paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }

    public int getNumberOfPaymentMethods() {
        return this.paymentMethods.size();
    }

    public double chargeCustomer(double transactionAmount, int index) {
        IChargeable paymentMethod = paymentMethods.get(index);
        return paymentMethod.getTransactionCost(transactionAmount);
    }
}
