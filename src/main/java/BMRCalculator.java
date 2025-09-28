public class BMRCalculator {

    public static double calculateBMR(int age, int height, double weight, String gender) {
        if (gender.equals("M")) {
            return 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
        } else if (gender.equals("F")) {
            return 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        } else {
            throw new IllegalArgumentException("Invalid gender");
        }
    }

    public static String categorizeBMR(double bmr) {
        if (bmr < 1200) return "Low Metabolism";
        else if (bmr < 1800) return "Moderate Metabolism";
        else if (bmr < 2500) return "High Metabolism";
        else return "Very High Metabolism";
    }

    public static String validateInput(int age, int height, double weight, String gender) {
        if (age <= 0 || age >= 120)
            return "Error: Age must be between 1 and 119.";
        if (weight <= 0 || weight >= 1000)
            return "Error: Weight must be between 1 and 999 pounds.";
        if (height <= 0 || height >= 100)
            return "Error: Height must be between 1 and 99 inches.";
        if (!gender.equals("M") && !gender.equals("F"))
            return "Error: Invalid gender. Please enter 'M' or 'F'.";
        return "VALID";
    }
}