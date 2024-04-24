//package Qc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void testAdd() {
    int a=4;
    int b=6;
        assertEquals(10, calculator.add(a, b));
    }

    @Test
    void testSub() {
    	int a=4;
        int b=6;
            assertEquals(-2, calculator.sub(a, b));
    }

}