/**
 * Created by Игорь on 28.10.2016.
 * Найдите сумму элементов массива
 */
public class Ex6 {
    public static void main(String[] args) {
        int sum = 0;
        int[] x = {1, 2, 3, 4, 5};
        for (int i = 0; i < x.length; i++) {
            sum = x[i] + sum;
        }
        System.out.println(sum);
    }
}
