/**
 * Created by Игорь on 19.10.2016.
 * Для задачи о счастливых билетах напишите функцию,
 * которая определяет является ли определенный билет счастливым.
 * Используя эту функцию найдите количество счастливых билетов от 100000 до 999999
 */
public class Ex8 {
    public static void main(String[] args) {

        int i = 100000;
        int b = 999999;
        int sum = 0;
        while (i <= b) {
            if (lucky(i)){
                sum = sum +1;
            }
            i++;
        }
        System.out.println("Счастливых билетов = " +sum);
    }

    public static boolean lucky(int i) {
        int num = i / 100000 % 10;
        int num1 = i / 10000 % 10;
        int num2 = i / 1000 % 10;
        int num3 = i / 100 % 10;
        int num4 = i / 10 % 10;
        int num5 = i % 10;
        if ((num + num1 + num2 == num3 + num4 + num5)) {
            return true;
        }
        return false;
    }
}