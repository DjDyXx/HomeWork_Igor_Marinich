package calculator;

import java.util.Scanner;

/**
 * Created by Игорь on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте.Вас приветствует калькулятор 3000.");
        System.out.println("Введите первый операнд : ");
        int op1 = getOperand1();
        System.out.println("Введите второй операнд :");
        int op2 =  getOperand2();
        System.out.println("Введите действие : ");
        String StrOperatation = getOperation();
    }

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
        if (getoperation == "^" && getoperation == "квадрат" && getoperation == "sqrt"
                && getoperation == "корень" && getoperation == "модуль" && getoperation == "| |") {
            int result = Calculate.calculator();
        } else {
            int result =

        }



    }
}