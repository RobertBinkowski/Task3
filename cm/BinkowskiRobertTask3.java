package cm;

import org.junit.jupiter.api.Test;
import src.CarParkKind;
import src.Period;
import src.Rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BinkowskiRobertTask3 {
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
    //Test the visitor rate
    public void newTest1(){
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(8);
        ArrayList<Period> reducedPeriods = new ArrayList<>(Arrays.asList(new Period(1,3), new Period(4,5)));
        ArrayList<Period> normalPeriods = new ArrayList<>((Arrays.asList(new Period(5,8), new Period(8,11))));

        CarParkKind kind = CarParkKind.VISITOR;

        Period periodStay = new Period(5,7);
        Rate r = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal(5),r.calculate(periodStay));
    }

    @Test
    //test minimum value
    public void newTest2(){
        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<>(Arrays.asList(new Period(1,3), new Period(4,5)));
        ArrayList<Period> normalPeriods = new ArrayList<>(Arrays.asList(new Period(7,10), new Period(11,12)));

        CarParkKind kind = CarParkKind.MANAGEMENT;
        Period periodStay = new Period(1,2);
        Rate r = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(new BigDecimal(4),r.calculate(periodStay));
    }

    @Test
    //Test value
    public void newTest3(){
        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<>(Arrays.asList(new Period(1,3), new Period(4,5)));
        ArrayList<Period> normalPeriods = new ArrayList<>(Arrays.asList(new Period(7,10), new Period(11,12)));

        CarParkKind kind = CarParkKind.MANAGEMENT;
        Period periodStay = new Period(1,5);
        Rate r = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(new BigDecimal(6),r.calculate(periodStay));
    }

    @Test
    //test value less than 5.50
    public void newTest4(){
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<>(Arrays.asList(new Period(1,3), new Period(4,5)));
        ArrayList<Period> normalPeriods = new ArrayList<>(Arrays.asList(new Period(7,10), new Period(11,12)));

        CarParkKind kind = CarParkKind.STUDENT;
        Period periodStay = new Period(7,8);
        Rate r = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(new BigDecimal(5),r.calculate(periodStay));
    }

}
