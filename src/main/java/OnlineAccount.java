import java.util.ArrayList;

public class OnlineAccount {
    private String name;
    private ArrayList<IChargeable> paymentMethods;
    private ReportingSoftware reportingSoftware;

    public OnlineAccount(String name, ReportingSoftware reportingSoftware) {
        this.name = name;
        this.paymentMethods = new ArrayList<IChargeable>();
        this.reportingSoftware = reportingSoftware;
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

    public void chargeCustomer(double purchaseAmount, int index) {
        IChargeable paymentMethod = paymentMethods.get(index);
        paymentMethod.charge(purchaseAmount);
        double transactionCost = paymentMethod.getTransactionCost(purchaseAmount);
        reportingSoftware.addTransactionCost(transactionCost);
    }
}
