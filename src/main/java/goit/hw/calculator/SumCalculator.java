package goit.hw.calculator;

public class SumCalculator implements Calculator {

    public int sum(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        if (n == 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }
}
