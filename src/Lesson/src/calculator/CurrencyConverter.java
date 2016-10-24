package calculator;

/**
 * Created by Игорь on 24.10.2016.
 */
public class CurrencyConverter {
    public static int convert (int operand1) {
        final int DOLLAR = 25;
        int result;
        result = (DOLLAR * operand1);
        return result;
    }
}
