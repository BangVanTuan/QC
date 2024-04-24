public class TriangleClassifier {
    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return "NotATriangle";
        else if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
            return "RightTriangle";
        else
            return "Scalene";
    }
}