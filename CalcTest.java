import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testAdunare() {
        assertEquals("8.0", Calculator.Run("3+5"));
    }

    @Test
    public void testInputInvalid() {
        assertEquals("ERROR", Calculator.Run("2+a"));
    }

    @Test
    public void testOperatiuniMultiple() {
        assertEquals("33.0", Calculator.Run("10+5*4+3"));
    }

    // Add more test cases here
}
