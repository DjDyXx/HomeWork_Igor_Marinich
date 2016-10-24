package calculator;

/**
 * Created by Игорь on 24.10.2016.
 */
public class Factorial {
    public static int calculate(int operand1){
        int result = 1;
        if (!(operand1 <=0)) {
            int n = operand1;
            while (n >= 1) {
                result = result * n;
                n--;
            }
        }else{
            System.out.println("Значение должно быть от 1 и выше");
        }
        return result;
    }
}
