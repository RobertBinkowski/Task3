// package cm;

import cm.CarParkKind;
import cm.Period;
import cm.Rate;

import jdk.jfr.Name;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class binkowskiRobertTest {

    @Test
    public void test1() {

        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(10, 17));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 24));

        assertDoesNotThrow(() -> new Rate(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriods, usualPeriods));
    }

    @Test
    public void test2() {

        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertDoesNotThrow(() -> rate.calculate(new Period(1, 2)));

    }

    @Test
    public void test3() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertDoesNotThrow(() -> rate.calculate(new Period(12, 18)));
    }

    @Test
    public void test4() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertDoesNotThrow(() -> rate.calculate(new Period(8, 24)));
    }

    @Test
    public void test5() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertDoesNotThrow(() -> rate.calculate(new Period(1, 2)));
    }

    @Test
    public void test6() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(0);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertDoesNotThrow(() -> rate.calculate(new Period(1, 24)));
    }

    @Test
    public void test7() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertDoesNotThrow(() -> rate.calculate(new Period(1, 24)));
    }

    @Test
    public void test8() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertThrows(IllegalArgumentException.class, () -> rate.calculate(new Period(18, -22)));
    }

    @Test
    public void test9() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 5));
        reducedPeriods.add(new Period(5, 12));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(12, 17));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        assertThrows(IllegalArgumentException.class, () -> rate.calculate(new Period(-5, 17)));
    }

    // Task 3 Section
    @Test
    @Name("Visitor Rate")
    public void newTest1() {
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(10);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(1, 3));
        reducedPeriods.add(new Period(4, 5));
        ArrayList<Period> usualPeriods = new ArrayList<>();
        usualPeriods.add(new Period(6, 12));
        usualPeriods.add(new Period(17, 24));

        CarParkKind kind = CarParkKind.VISITOR;
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, usualPeriods);

        Period period = new Period(6,7);

        assertEquals(new BigDecimal(0), () -> rate.calculate(period));
    }

}