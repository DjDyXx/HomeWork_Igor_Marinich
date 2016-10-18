package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Напишите программу, которая выводит максимальную цифру в числе n

 */
public class Ex9 {
    public static void main(String[] args) {
        int n = 2738;
        int m2 = 0;
        int max = 0;
        while (n>0){
            int m1 = n % 10;
            if (m1 > m2) {
                max = m1;
                m2 = m1;
            } else {
                max = m2;
            }
            n = n / 10;
        }System.out.println(max);
    }
}
