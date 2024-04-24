import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDateTest {
    @Test
    public void testNextDate_ValidInputs() {
        assertEquals("2-1-2010", NextDate.nextDate(1, 1, 2010));
        assertEquals("29-2-2012", NextDate.nextDate(28, 2, 2012)); 
        assertEquals("1-3-2012", NextDate.nextDate(29, 2, 2012));
    }

    @Test
    public void testNextDate_InvalidInputs() {
        assertEquals("Invalid date input", NextDate.nextDate(0, 1, 2024));
        assertEquals("Invalid date input", NextDate.nextDate(32, 1, 2024));
        assertEquals("Invalid date input", NextDate.nextDate(1, 0, 2024));
        assertEquals("Invalid date input", NextDate.nextDate(1, 13, 2024));
        assertEquals("Invalid date input", NextDate.nextDate(1, 1, 1811));
        assertEquals("Invalid date input", NextDate.nextDate(1, 1, 2013));
    }
}
