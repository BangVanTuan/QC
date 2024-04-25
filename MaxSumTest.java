import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxSumTest {

    @Test
    public void testMaxSumPositive() {
        MaxSum maxSum = new MaxSum();
        int maxint = 10;
        int value = 5;
        int expectedResult = 5;
        int result = maxSum.maxsum(maxint, value);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMaxSumNegativeValue() {
        MaxSum maxSum = new MaxSum();
        int maxint = 10;
        int value = -5;
        int expectedResult = 5;
        int result = maxSum.maxsum(maxint, value);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMaxSumTooLarge() {
        MaxSum maxSum = new MaxSum();
        int maxint = 5;
        int value = 10;
        int expectedResult = -1;
        int result = maxSum.maxsum(maxint, value);
        assertEquals(expectedResult, result);
    }
}
