public class EuclideanAlgorithm {

    public static int gcd(int m, int n) {
        if (n > m) {
            int r = m;
            m = n;
            n = r;
        }
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}
