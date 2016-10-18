package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Напишите программу, которая вычисляет следующие 20 високосных годов
 */
public class Ex6 {
    public static void main(String[] args) {
        int year = 2020;
        int n = 0;
        System.out.println("Следующие 20 високосных годов :");
        while (n<20){

            System.out.println(year);
            year = year+4;
            n++;
        }
    }
}
