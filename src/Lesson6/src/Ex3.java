/**
 * Created by Игорь on 19.10.2016.
 * Напишите функцию, которая вычисляет выражение x + 1 + x * x - 5.
 * В главной программе посчитайте сумму результатов функции для чисел от 1 до n.
 Например, если n = 3:
 при x = 1; x + 1 + x * x - 5 = -2
 при x = 2; x + 1 + x * x - 5 = 2
 при x = 3; x + 1 + x * x - 5 = 8
 Результат:
 -2 + 2 + 8 = 8
 */
public class Ex3 {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        while (1<=n) {
            int m = Equatio(n);
            n--;
            sum = sum + m ;
        }
        System.out.println(sum);
    }
    public static int Equatio(int x){
        int r = x + 1 + x * x -5;
        return r;
    }
}
