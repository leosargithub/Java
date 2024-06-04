public class CalculatorModel {
    private double result;

    public void add(double number1, double number2) {
        result = number1 + number2;
    }

    public void subtract(double number1, double number2) {
        result = number1 - number2;
    }

    public double getResult() {
        return result;
    }
}
