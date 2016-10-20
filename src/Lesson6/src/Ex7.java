import static java.lang.Math.pow;

/**
 * Created by Игорь on 19.10.2016.
 * Среди чисел от 1 до n, найдите все числа являющиеся степенью 3ки какого-то числа.
 * Проверку числа организуйте с помощью функции

 */
public class Ex7 {
    public static void main(String[] args) {
        int n = 729;
        while(1<=n){
            if(Numbertrue(n)){
                System.out.println(n);
            }
            n--;
        }
    }

    private static boolean Numbertrue(int n) {
        int m = n;
        while (1 <= m) {
            if (pow(m, 3) == n) {
                return true;
            }m--;
        }return false;
    }
}

