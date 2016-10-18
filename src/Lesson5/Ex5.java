package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Выведите каждое четное число последовательности от 1 до n
 */
public class Ex5 {
    public static void main(String[] args) {
        int m = 1;
        int n = 100;
        while (m < n) {
            if (m % 2 == 0)
            System.out.println(m);
            m++;
        }
    }
}
