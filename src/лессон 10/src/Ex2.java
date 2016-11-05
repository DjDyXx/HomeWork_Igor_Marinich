/**
 * Created by Notebook on 05.11.2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[][] x = new int[SIZE][SIZE];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = j;
            }
        }

        OutputArray.outputMatrix(x, SIZE);
    }
}
