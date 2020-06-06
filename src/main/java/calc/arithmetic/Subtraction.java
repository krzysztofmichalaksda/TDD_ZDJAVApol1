package calc.arithmetic;

public class Subtraction {
    public static double multiNumbers(double base, double[] numbers) {
        double result = base;
//        for (int i = 0; i < numbers.length; i++) {
//            result -= numbers[i];
//        }
        for (double number : numbers) {
            result -= number;
        }

        return result;
    }
}
