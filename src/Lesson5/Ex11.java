package Lesson5;

/**
 * Created by Игорь on 17.10.2016.
 * Перевести число из 10ной в 2ную систему счисления
 */
public class Ex11 {
    public static void main(String[] args) {
        int n = 13;
        int q;
        String s = "";
        while (n!=0) {
            q = n%2;
            s = q+s;
            n = n/2;
        }System.out.print(s);
    }
}
