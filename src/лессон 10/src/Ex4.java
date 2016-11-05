/**
 * Created by Notebook on 05.11.2016.
 */
public class Ex4 {
    public static void main(String[] args) {
        final int size = 4;
        String [][]array = {
                {"Student name : ","Igor","Mark","Christina"},
                {"Math : ","10","6","9"},
                {"Physic : ","11","7","10"},
                {"Chimie : ","9","8","6"}
        };
        OutputArray.outputMatrixString(array,size);
        System.out.println("Средняя оценка по предметам "+ array[0][1] + " : ");
        OutputMath.calculateMid(array);
        System.out.println("Средняя оценка по предметам "+ array[0][2]+ " : ");
        OutputMath.calculateMid1(array);
        System.out.println("Средняя оценка по предметам "+ array[0][3]+ " : ");
        OutputMath.calculateMid2(array);
        System.out.println("Средняя оценка всех студентов по предметам : ");
        System.out.println(OutputMath.calculateAll(array));
    }
}
