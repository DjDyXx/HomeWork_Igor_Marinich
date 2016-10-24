package calculator;

import java.util.Scanner;

/**
 * Created by Игорь on 24.10.2016.
 */
public class Input {
    public static int getOperand1() {
        Scanner op1 = new Scanner(System.in);
        int operand1 = op1.nextInt();
        return operand1;
    }


    public static int getOperand2() {
        Scanner op2 = new Scanner(System.in);
        int operand2 = op2.nextInt();
        return operand2;
    }


    public static String getOperation() {
        Scanner getoper = new Scanner(System.in);
        String getoperation = getoper.next();
        return getoperation;

    }
}
