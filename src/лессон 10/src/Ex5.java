/**
 * Created by Notebook on 05.11.2016.
 */

import javax.print.attribute.Size2DSyntax;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner arraysc = new Scanner(System.in);
        System.out.println("Здравствуйте,вас приветствует программа врода двумерного массива");
        System.out.println("Для начала давайте определимся с размером массива.Введите кол-во столбцов");
        int size1 = arraysc.nextInt();
        System.out.println("Введите кол-во строк");
        int size2 = arraysc.nextInt();

        int[][] array = new int[size1][size2];


        for (int i = 0; i < size1; i++) {
            System.out.println("Введите значения в " + (i + 1) + " строку");
            for (int j = 0; j < size2; j++) {
                int zna4enie = arraysc.nextInt();
                array[i][j] = zna4enie;
            }
        }
        OutputArray.outputMatrix(array, size1);
    }
}
