import java.util.ArrayList;

public class ReportingSoftware {

    private ArrayList<Double> transactionCosts;

    public ReportingSoftware() {
        this.transactionCosts = new ArrayList<Double>();
    }

    public void addTransactionCost(double transactionCost){
        this.transactionCosts.add(transactionCost);
    }

    public int getNumberOfTransactionCosts(){
        return this.transactionCosts.size();
    }
}
