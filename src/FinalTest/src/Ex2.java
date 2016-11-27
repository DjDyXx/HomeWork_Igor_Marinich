/**
 * Created by Игорь on 27.11.2016.
 * Создать массив из 10 элементов и проинициализировать его простыми числами в случайном порядке
 */
// 2 3 5 7 11 13 17 19 23 29
//

import java.util.Random;

public class Ex2 {
    private static String[] array1 = {"2", "3", "5", "7", "11", "13", "17", "19", "23", "29"};
    private static String allVariantsArray = "";

    public static void main(String[] args) {
        Random r1 = new Random();
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            int result = r1.nextInt(10);
            boolean isTrue = false;
            if (isWas(result)) {
                isTrue = true;
                array[result] = Integer.parseInt(array1[i]);
            } else {
                while (isTrue == false) {
                    result = r1.nextInt(10);
                    if (isWas(result)) {
                        array[result] = Integer.parseInt(array1[i++]);
                        isTrue = true;
                    }
                }
            }
        }
        arrayOutput(array);
    }

    public static boolean isWas(int result) {
        char[] array = allVariantsArray.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(String.valueOf(array[i])) == result) {
                return false;
            }
        }
        allVariantsArray = allVariantsArray + result;
        return true;
    }

    private static void arrayOutput(int[] array) {
        System.out.println("Вот массив : ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
