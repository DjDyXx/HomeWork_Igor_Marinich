package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Напишите программу, которая выводит таблицу умножения для выбранного числа
 */
public class Ex8 {
    public static void main(String[] args) {
        int numb = 8;
        int amount = 0;
        while (amount < 10) {
            amount++;
            System.out.println(amount + "*"+ numb + "="+amount * numb);
        }
    }

    }

