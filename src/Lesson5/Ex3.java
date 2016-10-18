package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Создайте программу, выводящую на экран все неотрицательные
 * элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class Ex3 {
    public static void main(String[] args) {
        int n = 90;
        while (n > 0) {
            System.out.println(n);
            n = n-5;
        }
    }
}
