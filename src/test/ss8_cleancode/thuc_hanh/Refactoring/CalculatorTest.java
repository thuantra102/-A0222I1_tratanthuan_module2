package ss8_cleancode.thuc_hanh.Refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calculate() {
        int result = Calculator.calculate(1,3, '+');
        assertEquals(40, result);
    }
    @Test
    public void calculateSub(){
        int result = Calculator.calculate(4, 1,'-');
        assertEquals(3,result);
    }
}