package Lesson5;

/**
 * Created by Игорь on 18.10.2016.
 */
public class ewqe {
    public static void main(String[] args) {

        int n = 27981;
        int max = 0;

        while (n > 0) {
            int x = n % 10; // 8
            n = n / 10; // 273

            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
