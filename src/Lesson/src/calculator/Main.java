package calculator;

import java.util.Scanner;

/**
 * Created by Игорь on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте.Вас приветствует калькулятор 3000.");
        System.out.println("Введите первый операнд : ");
        int op1 = Input.getOperand1();
        System.out.println("Введите действие : ");
        String StrOperatation = Input.getOperation();
        if (StrOperatation.equals("^")
                || StrOperatation.equals("квадрат") || StrOperatation.equals("sqrt")
                || StrOperatation.equals("корень") || StrOperatation.equals("модуль") || StrOperatation.equals("| |")
                || StrOperatation.equals("перевод долларов в гривни")
                || StrOperatation.equals("факториал") || StrOperatation.equals("шкала Бофорта")) {


            if (Calculate.calculator(StrOperatation, op1) == 0) {
                System.out.println("Конец программы.");
            } else {
                System.out.println("Результат = " + Calculate.calculator(StrOperatation, op1));
                System.out.println("Конец программы.");
            }


        } else {
            System.out.println("Введите второй операнд :");
            int op2 = Input.getOperand2();
            System.out.println("Результат = " + Calculate.calculator(StrOperatation, op1, op2));
            System.out.println("Конец программы.");
        }
    }
}
