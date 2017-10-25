package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1.0, 1.0);
        Assert.assertEquals(2.0, calculator.getResult(), 0.000001);
    }

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(9, 10);
        assertEquals(0.9, calculator.getResult(), 0.000001);
    }

}