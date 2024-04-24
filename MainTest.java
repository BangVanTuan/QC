import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    // Kiểm tra tất cả các lệnh trong chương trình
    @Test
    public void testAllStatements() {
        Main main = new Main();
        String expectedOutput = "0 là số chẵn.\n1 là số lẻ.\n2 là số chẵn.\n3 là số lẻ.\n4 là số chẵn.\n";
        assertEquals(expectedOutput, main.generateOutput(5));
    }

    // Kiểm tra tất cả các đường đi trong chương trình
    @Test
    public void testAllPaths() {
        Main main = new Main();
        String expectedOutput = "0 là số chẵn.\n1 là số lẻ.\n2 là số chẵn.\n3 là số lẻ.\n4 là số chẵn.\n";
        assertEquals(expectedOutput, main.generateOutput(5));
    }
}
