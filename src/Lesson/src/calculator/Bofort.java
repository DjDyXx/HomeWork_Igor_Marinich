package calculator;

/**
 * Created by Игорь on 24.10.2016.
 */
public class Bofort {
    public  static void translate(int operand1){
        if(operand1 <=0){
            System.out.println("Вы ввели неверное значение");
        }
        else if (operand1 <= 1) {
            System.out.println("0 баллов. Штиль.");
        }
        else if (operand1 <= 3) {
            System.out.println("1 балл по шкале Бофорта. Тихий ветер.");
        }
        else if (operand1 <= 6) {
            System.out.println("2 балла по шкале Бофорта. Легкий ветер.");
        }
        else if (operand1 <= 10) {
            System.out.println("3 балла по шкале Бофорта. Слабый ветер.");
        }
        else if (operand1 <= 16) {
            System.out.println("4 балла по шкале Бофорта. Умеренный ветер.");
        }
        else if (operand1 <= 21) {
            System.out.println("5 баллов по шкале Бофорта. Свежий ветер.");
        }
        else if (operand1 <= 27) {
            System.out.println("6 баллов по шкале Бофорта. Сильный ветер.");
        }
        else if (operand1 <= 33) {
            System.out.println("7 баллов по шкале Бофорта. Крепкий ветер.");
        }
        else if (operand1 <= 40) {
            System.out.println("8 баллов по шкале Бофорта. Очень крепкий ветер.");
        }
        else if (operand1 <= 47) {
            System.out.println("9 баллов по шкале Бофорта. Шторм.");
        }
        else if (operand1 <= 55) {
            System.out.println("10 баллов по шкале Бофорта. Сильный шторм.");
        }
        else if (operand1 <= 63) {
            System.out.println("11 баллов по шкале Бофорта. Жестокий шторм.");
        }
        else {
            System.out.println("12 баллов по шкале Бофорта. Ураган.");
        }
    }
}
