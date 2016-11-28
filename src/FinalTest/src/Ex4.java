/**
 * Created by Игорь on 27.11.2016.
 * <p>
 * В одномерном массиве поменять местами минимальный и максимальный элементы.
 * Остальные оставить на своих местах
 */

public class Ex4 {
    public static void main(String[] args) {
        int[] array = {3, 5, 390, 33, 4, 1};
        System.out.println("До подмены : ");
        output(array);
        System.out.println();
        System.out.println("После подмены : ");
        calculate(array);
        output(array);
    }

    public static void calculate(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == min) {
                array[i] = max;
            }else if (array[i] == max) {
                array[i] = min;
            }
        }
    }

    public static void output(int[] array) {
        System.out.print(" {");
        for (int elem : array) {
            System.out.print(elem + ", ");
        }
        System.out.print("}");
    }
}