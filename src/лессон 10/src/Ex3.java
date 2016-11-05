/**
 * Created by Notebook on 05.11.2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[][] x = new int[SIZE][SIZE];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = i;
            }
        }

        OutputArray.outputMatrix(x, SIZE);
    }
}
