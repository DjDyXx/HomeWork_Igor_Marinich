import java.util.Random;

/**
 * Created by Игорь on 02.11.2016.
 * Сгенерируйте случайное нечетное число из промежутка от 50 до 150
 */
public class Ex1 {
    public static void main(String[] args) {
        int n = 150;
        fromFiftyToN(n);
    }

    private static void fromFiftyToN(int n) {
        Random random = new Random();
        int number = random.nextInt((n - 50) + 51);
        if (number % 2 != 0) {
            System.out.println(number);
        }
    }
}
