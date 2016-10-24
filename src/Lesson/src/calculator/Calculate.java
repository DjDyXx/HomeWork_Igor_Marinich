package calculator;

import java.util.Scanner;

/**
 * Created by Игорь on 24.10.2016.
 */
public class Calculate {
    public static double calculator(String getoperation, int operand1) {
        double result = 0;
        switch (getoperation) {
            case "квадрат":
                result = operand1*operand1;
                break;
            case "sqrt":
                result = (int) Math.sqrt(operand1);
                break;
            case "корень":
                result = (int) Math.sqrt(operand1);
                break;
            case "модуль":
                if(operand1<0) {
                    result = operand1 * -1;
                }
                break;
            case "| |":
                if(operand1<0){
                    result = operand1*-1;
                }
                break;
            case "перевод долларов в гривни":
                result = CurrencyConverter.convert(operand1);
                break;
            case "факториал":
               result = Factorial.calculate(operand1);
                break;
            case "шкала Бофорта":
                Bofort.translate(operand1);
                break;

            default: result = operand1;;
        }
        return result;
    }

    public static int calculator(String getoperation, int operand1 , int operand2) {
        int result = 0;
        switch (getoperation) {
            case "+":
                result = operand1+operand2;
                break;
            case "-":
                result = operand1-operand2;
                break;
            case "/":
                result = operand1/operand2;
                break;
            case "*":
                result = operand1*operand2;
                break;
            case "%":
                result = operand1%operand2;
                break;
            default: result = operand1;;
        }
        return result;
    }
}
