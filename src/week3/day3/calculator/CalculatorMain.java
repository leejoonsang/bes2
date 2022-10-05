package week3.day3.calculator;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new ByPassNumberCreator());
        Calculator calculator1 = new Calculator(new ByPassNumberCreator(), 100);
        calculator.plus(10);
        calculator.plus(20);
        calculator1.plus(50);

    }
}
