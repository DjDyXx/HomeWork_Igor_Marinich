/**
 * Created by Notebook on 05.11.2016.
 */
public class OutputArray {
    public static void output(int[]array) {
        System.out.print(" {");
        for (int elem:array){
            System.out.print(elem +", ");
        }
        System.out.print("}");
    }
    public static void outputMatrix(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("{");
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("}");
        }
    }
    public static void outputMatrixString(String[][] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("{");
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("}");
        }
    }
}
