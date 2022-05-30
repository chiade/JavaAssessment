package Test;

import ExceptionHandling.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    //e.g. test all the methods in the Calculator Class
    //1) still need to create instance of Calculator
    private Calculator calculator;

    //@Before - before the test, need to do some initial setup e.g. create instance of object
    @Before
    public void setup() {
        calculator = new Calculator();
    }
    //Test add method by creating the Test case
    @Test
    public void testAdd() {
        //expected: the method that we want to use, actual is the outcome
        assertEquals(5, calculator.add(2,3));
    }
    @Test
    public void testSubtract() {
        //return int
        assertEquals(3, calculator.subtract(5,2));
    }
    @Test
    public void testMultiply() {
        //return int
        assertEquals(10, calculator.multiply(5,2));
    }
    @Test
    public void testDivide() {
        //Test return double
        //assertEquals(double, double) - deprecated
        //assertEquals(double expected, double actual, double delta)
        //precision 1.3333333
        assertEquals(2.5, calculator.divide(5,2),1);
        //assertEquals(0, calculator.divide(5,0),1);
    }
    @Test (expected = ArithmeticException.class)
    public void testDivideException() {
        calculator.divide(5, 0);
    }
}
