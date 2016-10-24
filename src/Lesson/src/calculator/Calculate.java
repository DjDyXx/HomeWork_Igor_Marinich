package calculator;

import java.util.Scanner;

/**
 * Created by Игорь on 24.10.2016.
 */
public class Calculate {
    public static int calculator(String getoperation, int operand1) {
        int result = 0;
        switch (StrOperatation) {
            case "^":
                result = op1;
                break;
            case "квадрат":
                result = operand1*operand1;
                break;
            case "sqrt":
                result = operand1;
                break;
            case "корень":
                result = operand1;
                break;
            case "модуль":
                result = operand1;
                break;
            case "| |":
                result = operand1;
                break;
            default: result = operand1;;
        }
        return result;
    }

    public static int calculator(String getoperation, int operand1 , int operand2) {
        int result = 0;
        switch (getoperation) {
            case "^":
                result = operand1;
                break;
            case "квадрат":
                result = operand1*operand2;
                break;
            case "sqrt":
                result = operand1;
                break;
            case "корень":
                result = operand1;
                break;
            case "модуль":
                result = operand1;
                break;
            case "| |":
                result = operand1;
                break;
            default: result = operand1;;
        }
        return result;
    }
}
