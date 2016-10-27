/**
 * Created by Игорь on 28.10.2016.
 * Определите сумму минимального и максимального элементов массива
 */
public class Ex8 {
    public static void main(String[] args) {
        int[]x={1,2,3,4,5,6,7,8,9};
        int min = 1;
        int max = 1;
        for(int i = 0; i < x.length; i++){
            if(min>x[i]){
                min=x[i];
            }
            if(max<x[i]){
                max=x[i];
            }
        }
        System.out.println(min+max);
    }
}
