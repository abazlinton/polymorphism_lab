import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReportingSoftwareTest {


    @Test
    public void startsWithNoTransactionCosts(){
        ReportingSoftware reportingSoftware = new ReportingSoftware();
        assertEquals(0, reportingSoftware.getNumberOfTransactionCosts());

    }

    @Test
    public void canAddTransactionCosts(){
        ReportingSoftware reportingSoftware = new ReportingSoftware();
        reportingSoftware.addTransactionCost(10);
        assertEquals(1, reportingSoftware.getNumberOfTransactionCosts());

    }


}
