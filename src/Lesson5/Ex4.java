package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Создайте программу, выводящую на экран первые 20
 * элементов последовательности 2 4 8 16 32 64 128 ….

 */
public class Ex4 {
    public static void main(String[] args) {
        int n = 2;
        int m = 0;
        while (m < 20) {
            System.out.println(n);
            n= n*2;
            m++;
        }
    }
}
