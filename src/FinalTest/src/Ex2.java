/**
 * Created by Игорь on 27.11.2016.
 * Создать массив из 10 элементов и проинициализировать его простыми числами в случайном порядке
 */
// 2 3 5 7 11 13 17 19 23 29
//

import java.util.ArrayList;
import java.util.Random;

public class Ex2 {
    private static int [] array1 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    private static ArrayList VarArray = new ArrayList();
    private static int n = 0;
    private static int error = 0;

    public static void main(String[] args) {
        Random r1 = new Random();
        int[] array = new int[10];
        for(int i = 0;i<array1.length+error;i++){
            int result = r1.nextInt(10);

            if (isWas(result)){
                array[result] = array1[n];
                VarArray.add(n, result);
                n++;
            }else{
                error++;
            }
        }arrayOutput(array);
    }

    public static boolean isWas(int result) {
        for (int i = 0;i<VarArray.size();i++){
            Object x = (Integer) result;
            if (VarArray.get(i) == x) {
                return false;
            }
        }return true;
    }

    private static void arrayOutput(int[] array) {
        System.out.println("Вот массив : ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}



