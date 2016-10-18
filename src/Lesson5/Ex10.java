package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Напишите программу, которая выводит сумму минимальной и максимальной цифры числа n
 */
public class Ex10 {
    public static void main(String[] args) {
        int n = 15723;
        int m2 = 0;
        int res = 0;
        int res2 = 0;
        int n2 = n;
            while (n2 > 0) {
                int m1 = n2 % 10;
                if (m1 > m2) {
                    res = m1;
                    m2 = m1;
                } else {
                    res = m2;
                }
                n2 = n2 / 10;
            }
            while (n > 0) {
                int m1 = n % 10;
                if (m1 < m2) {
                    res2 = m1;
                    m2 = m1;
                } else {
                    res2 = m2;
                }
                n = n / 10;
            }
        System.out.println(res);
        System.out.println(res2);
        }

    }
