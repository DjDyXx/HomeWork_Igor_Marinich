package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Напишите программу, которая выводит сумму минимальной и максимальной цифры числа n
 */
public class Ex10 {
    public static void main(String[] args) {
        int n = 15723;
        int max = 0;
        int min = 9;

        while (n > 0) {
            int m = n %10;
            n = n/10;

            if (m > max) {
                max = m;
            }
            if (m < min) {
                min = m;
            }
        }
        System.out.println(max + min);
        }

    }
