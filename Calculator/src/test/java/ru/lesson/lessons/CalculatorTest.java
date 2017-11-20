package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.add(1.0, 1.0);
        Assert.assertEquals(2.0, calculator.getResult(), 0.000001);
    }

    @Test
    public void test1() {
        System.out.println(System.getProperty("city"));
    }

    @Test
    public void testSub()  {
        Calculator calculator = new Calculator();
        calculator.sub(1.0, 0.0);
        Assert.assertEquals(1.0, calculator.getResult(), 0.000001);
    }

    @Test(expected=UserException.class)
    public void testMul() throws UserException {
        Calculator calculator = new Calculator();
        calculator.mul();

    }

    @Test(expected=UserException.class)
    public void mulException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.mul(1);
    }

    @Test
    public void testDiv() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(-2, -1);
        Assert.assertEquals(2, calculator.getResult(), 0.00000000001);
    }

    @Test(expected=UserException.class)
    public void testDivNoArgs() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div();
        Assert.assertEquals(1, calculator.getResult(), 0.00000000001);
    }

    @Test(expected=UserException.class)
    public void divException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(1.0);
    }

    @Test(expected = UserException.class)
    public void testDivRuntimeException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(1, 0);

    }
}