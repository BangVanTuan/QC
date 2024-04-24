public class Main {
    public String generateOutput(int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                output.append(i).append(" là số chẵn.\n");
            } else {
                output.append(i).append(" là số lẻ.\n");
            }
        }
        return output.toString();
    }
}
