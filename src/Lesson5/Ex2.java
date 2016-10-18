package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Создайте программу, выводящую на экран первые 55 элементов
 * последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class Ex2 {
    public static void main(String[] args) {
        int n = 1;
        int m = 0;
        while (m<55) {
            System.out.println(n);
            n = n + 2;
            m++;
        }
    }
}
