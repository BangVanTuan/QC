import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testtamgiac {
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 5, 3));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 6));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", TriangleClassifier.classifyTriangle(0, 4, 5));
    }
}