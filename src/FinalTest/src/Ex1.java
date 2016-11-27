/**
 * Created by Игорь on 27.11.2016.
 * Найти произведение нечетных цифр пятизначного целого числа, введенного пользователем с клавиатуры
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int multiply = 1;
        Scanner sc1 = new Scanner(System.in);
        String numbers = sc1.nextLine();
        char[] array = numbers.toCharArray();

        for (int i = 0; i < array.length; i++) {

            int x = Integer.parseInt(String.valueOf(array[i]));
            if (x % 2 != 0) {
                multiply = multiply * x;
            }
        }
        System.out.println(multiply);

    }
}
