/**
 * Created by Игорь on 19.10.2016.
 * Найдите среди чисел от 1 до n все которые делятся на 3 и на 5 одновременно. Проверку числа реализуйте в функции

 */
public class Ex5 {
    public static void main(String[] args) {
        int n = 20;

        while (1 <= n) {
            if (isThreeFive(n)) {
                System.out.println(n);
            }
            n--;
        }
    }

    private static boolean isThreeFive(int n) {
            if ((n % 3 == 0) && (n % 5 == 0)) {
                return true;
            }return false;
        }
    }
