package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        int addition = c.add(1, 2);
        System.out.println("c.add(1, 2) = " + addition);

        int subtraction = c.sub(2, 1);
        System.out.println("c.sub(2, 1) = " + subtraction);

    }
}
