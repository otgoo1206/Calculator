package labxx.sict.must.edu.mn;

public class Calculator {
    private final Addition addition = new Addition();
    private final Subtraction subtraction = new Subtraction();
    private final Multiplication multiplication = new Multiplication();
    private final Division division = new Division();

    public double add(double a, double b) {
        return addition.add(a, b);
    }

    public double subtract(double a, double b) {
        return subtraction.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return multiplication.multiply(a, b);
    }

    public double divide(double a, double b) {
        return division.divide(a, b);
    }
}
