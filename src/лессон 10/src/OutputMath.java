import java.util.InputMismatchException;

/**
 * Created by Notebook on 05.11.2016.
 */
public class OutputMath {
    public static String calculateMid(String[][] array) {
        int all = 0;
            for (int j = 1; j < array.length; j++) {
                all = all+Integer.parseInt(array[1][j]);
            }
            System.out.println(String.valueOf((Integer.parseInt(String.valueOf(all/3)))));
        return "0";
    }
    public static String calculateMid1(String[][] array) {
        int all = 0;
        for (int j = 1; j < array.length; j++) {
            all = all+Integer.parseInt(array[2][j]);
        }
        System.out.println(String.valueOf((Integer.parseInt(String.valueOf(all/3)))));
        return "0";
    }
    public static String calculateMid2(String[][] array) {
        int all = 0;
        for (int j = 1; j < array.length; j++) {
            all = all+Integer.parseInt(array[3][j]);
        }
        System.out.println(String.valueOf((Integer.parseInt(String.valueOf(all/3)))));
        return "0";
    }



        public static String calculateAll(String[][]array){
            int all = 0;
            for (int i = 1; i < array.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    all = all+Integer.parseInt(array[i][j]);
                }
            }return String.valueOf((Integer.parseInt(String.valueOf(all/9))));
        }
    }


//int result = Integer.parseInt(number);
// среднее арифметическое всех оценок всего класса и каждого по предметам