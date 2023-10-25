package es.ing.tddworkshopsession1;

public class FibonacciCalculator {
    public static int getValueAtIndex(int index) {
        return switch (index) {
            case 0 -> 0;
            case 1 -> 1;
            default -> getValueAtIndex(index - 1) + getValueAtIndex(index - 2);
        };
    }
}
