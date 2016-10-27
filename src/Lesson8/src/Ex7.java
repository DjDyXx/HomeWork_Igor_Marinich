/**
 * Created by Игорь on 28.10.2016.
 Найдите среднее арифметическое элементов массива
 */
public class Ex7 {
    public static void main(String[] args) {
        int sr = 0;
        int[] x = {1, 2, 3, 4, 5};
        for (int i = 0; i < x.length; i++) {
            sr = x[i] + sr;

        }
        System.out.println(sr/x.length);
    }
}
