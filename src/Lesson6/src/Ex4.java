/**
 * Created by Игорь on 19.10.2016.
 * Напишите 2 функции:
 - вычисление суммы чисел от 1 до n
 - вычисление произведения чисел от 1 до n
 Протестируйте их работу в главной функции

 */
public class Ex4 {
    public static void main(String[] args) {
        int n = 5;
        int func = sum(n);
        int func2 = square(n);
        System.out.println(func);
        System.out.println(func2);
    }
    public static int sum(int n){
        int sum = 0;
        while (1<=n){
            sum = sum + n;
            n--;
        }
        return sum;
    }
    public static int square (int n){
        int square = 1;
        while(1<=n){
            square = square * n;
        n--;
        }return square;
    }
}
