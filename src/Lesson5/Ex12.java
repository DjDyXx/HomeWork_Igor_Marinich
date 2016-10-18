package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Посчитать количество счастливых билетов от 100000 до 999999:
 * билет счастливый если сумма первых трех цифр равна сумме трех последних
 * например, 123312: 1+2+3==3+1+2
 */
public class Ex12 {

    public static void main(String[] args) {
        int n1 = 100000;
        int n2 = 999999;
        int amount;
        int amount2;
        int three = 0;
        int threen = n1;
        int three1 = 0;
        int three1n = n1;
        int sum = 0;
        int sum1 = 0;
        int mil = 100000;
        while ((n2+1) > n1) {
            while (three < 3) {
                amount = threen % 10;
                sum = sum + amount;
                three++;
                threen = threen / 10;
            }
            while (three1 < 3) {
                amount2 = (three1n / mil) % 10 ;
                sum1 = sum1 + amount2;
                three1++;
                mil = mil/10;
            }
            if (sum == sum1) {
                System.out.println(n1);
            }
            n1++;
            three = three - 3;
            three1 = three1 - 3;
            mil = 100000;
            threen = n1;
            three1n = n1;
            sum = 0;
            sum1 = 0;
        }

    }
}

