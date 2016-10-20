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
        int sum = 0;
        while (n1 <= n2) {
            int num1 = n1/100000%10;
            int num2 = n1/10000%10;
            int num3 = n1/1000%10;
            int num4 = n1/100%10;
            int num5 = n1/10%10;
            int num6 = n1%10;
            int sum1 = num1+num2+num3;
            int sum2 = num4+num5+num6;
            if (sum1 == sum2) {
                System.out.println(n1);
                sum = sum + 1;
            }
            n1++;
        }
        System.out.println("Сумма билетов = " + sum );
    }
}

