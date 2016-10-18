package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Напишите программу, которая вычисляет сумму и произведение
 * чисел от 1 до n
 */
public class Ex7 {
    public static void main(String[] args) {
        int n = 10;
        int m = 1;
        int result1=0;
        int result2=1;
        while (m < (n+1)) {

            result1 += m;
            result2 = result2*m;
            m++;
        }

        System.out.println(result1);
        System.out.println(result2);
    }
}
