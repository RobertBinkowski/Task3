import jdk.jfr.Name;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;


public class BinkowskiRobertTask3 {

    // Task 3 Section
    @Test
    @Name("Visitor Rate")
    public void newTest1() {
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(10);

        ArrayList<cm.Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new cm.Period(1, 3));
        reducedPeriods.add(new cm.Period(4, 5));
        ArrayList<cm.Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new cm.Period(6, 12));
        usualPeriods.add(new cm.Period(17, 24));

        cm.CarParkKind kind = cm.CarParkKind.VISITOR;
        cm.Rate rate = new cm.Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        cm.Period period = new cm.Period(6,7);

        assertEquals(new BigDecimal(0), () -> rate.calculate(period));
    }
}
