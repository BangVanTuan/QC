import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanAlgorithmTest {

    @Test
    void testGCD() {
        assertEquals(6, EuclideanAlgorithm.gcd(18, 12));
        assertEquals(1, EuclideanAlgorithm.gcd(17, 5));
        assertEquals(3, EuclideanAlgorithm.gcd(15, 9));
        assertEquals(9, EuclideanAlgorithm.gcd(27, 36));
    }
}
