public class MaxSum {

    public int maxsum(int maxint, int value) {
        int result = 0;
        int i = 0;

        if (value < 0) {
            value = -value;
        }

        while (i < value && result <= maxint) {
            i++;
            result++;
        }

        if (result <= maxint) {
            return result;
        } else {
            return -1;
        }
    }
}
