package Lesson5;

/**
 * Created by Игорь on 16.10.2016.
 * Создайте программу, выводящую на экран все четырёхзначные числа
 * последовательности 1000 1003 1006 1009 1012 1015 ….

 */
public class Ex1 {
    public static void main(String[] args) {
        int n=1000;
        while ((n > 999) && (n < 10000)) {
            System.out.println(n);
            n = n+3;
        }
    }

}
