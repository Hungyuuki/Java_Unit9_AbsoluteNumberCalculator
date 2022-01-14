import com.company.AbsoluteNumberCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AbsoluteNumberCalculatorTest {
    @Test
    public void AbsNumberTestNegative2() {
        int expectedValue = 2;
        int actualValue = AbsoluteNumberCalculator.findAbsoluteNumber(-2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void AbsNumberTestNegative1() {
        int expectedValue = -1;
        int actualValue = AbsoluteNumberCalculator.findAbsoluteNumber(-1);
        if (expectedValue != actualValue) {
            throw new RuntimeException("Invalid");
        }
        assertEquals(expectedValue, actualValue);
    }
}
