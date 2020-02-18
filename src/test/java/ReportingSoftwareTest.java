import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReportingSoftwareTest {


    @Test
    public void canAddTransactionCosts(){
        ReportingSoftware reportingSoftware = new ReportingSoftware();
        reportingSoftware.addTransactionCost(10);
        assertEquals(1, reportingSoftware.getNumberOfTransactionCosts());

    }


}
