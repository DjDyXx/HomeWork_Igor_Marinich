/**
 * Created by Игорь on 27.11.2016.
 * В двумерном массиве отсортировать четные столбцы по возрастанию, а нечетные - по убыванию
 */
public class Ex5 {
    public static void main(String[] args) {
        final int SIZE = 5;
        String[][] array =
                {
                        {"Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4", "Столбец 5"},
                        {"31", "40", "1", "15", "86"},
                        {"100", "33", "2", "9", "43"},
                        {"23", "58", "10", "57", "3"},
                        {"1", "98", "5", "48", "8"}

                };
        System.out.println("До сортировки : ");
        System.out.println();
        outputMatrixString(array, SIZE);
        System.out.println();
        String[][] newArray = sortMatrixString(array, SIZE);
        System.out.println("После сортировки : ");
        System.out.println();
        outputMatrixString(newArray, SIZE);
    }

    private static String[][] sortMatrixString(String[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (i % 2 == 0) {
                    for (int k = 0; k < size; k++) {
                        if (k != size - 1 && Integer.parseInt(array[j][i]) < Integer.parseInt(array[k + 1][i])) {
                            int buf = Integer.parseInt(array[j][i]);
                            array[j][i] = array[k + 1][i];
                            array[k + 1][i] = String.valueOf(buf);
                        }
                    }
                }
                if (i % 2 != 0) {
                    for (int k = 0; k < size; k++) {
                        if (k != size - 1 && Integer.parseInt(array[j][i]) > Integer.parseInt(array[k + 1][i])) {
                            int buf = Integer.parseInt(array[j][i]);
                            array[j][i] = array[k + 1][i];
                            array[k + 1][i] = String.valueOf(buf);
                        }
                    }
                }
            }
        }
        return array;
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
