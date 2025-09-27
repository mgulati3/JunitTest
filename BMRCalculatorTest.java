import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMRCalculatorTest {

    @Test
    public void testValidMaleModerateBMR() {
        double bmr = BMRCalculator.calculateBMR(25, 70, 150, "M");
        assertEquals("Moderate Metabolism", BMRCalculator.categorizeBMR(bmr));
    }

    @Test
    public void testValidFemaleHighBMR() {
        double bmr = BMRCalculator.calculateBMR(40, 65, 180, "F");
        assertEquals("High Metabolism", BMRCalculator.categorizeBMR(bmr));
    }

    @Test
    public void testVeryHighBMR() {
        double bmr = BMRCalculator.calculateBMR(30, 72, 300, "M");
        assertEquals("Very High Metabolism", BMRCalculator.categorizeBMR(bmr));
    }

    @Test
    public void testLowBMR() {
        double bmr = BMRCalculator.calculateBMR(25, 70, 100, "F");
        assertEquals("Low Metabolism", BMRCalculator.categorizeBMR(bmr));
    }

    @Test
    public void testInvalidAgeZero() {
        String result = BMRCalculator.validateInput(0, 65, 150, "M");
        assertEquals("Error: Age must be between 1 and 119.", result);
    }

    @Test
    public void testInvalidHeight() {
        String result = BMRCalculator.validateInput(25, 0, 150, "M");
        assertEquals("Error: Height must be between 1 and 99 inches.", result);
    }

    @Test
    public void testInvalidWeight() {
        String result = BMRCalculator.validateInput(25, 70, 0, "M");
        assertEquals("Error: Weight must be between 1 and 999 pounds.", result);
    }

    @Test
    public void testInvalidGender() {
        String result = BMRCalculator.validateInput(25, 70, 150, "X");
        assertEquals("Error: Invalid gender. Please enter 'M' or 'F'.", result);
    }

    @Test
    public void testValidInput() {
        String result = BMRCalculator.validateInput(25, 70, 150, "F");
        assertEquals("VALID", result);
    }
}
