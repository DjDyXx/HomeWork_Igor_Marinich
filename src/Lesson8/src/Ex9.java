/**
 * Created by Игорь on 28.10.2016.
 * Определите произведение всех нечетных элементов массива

 */
public class Ex9 {
    public static void main(String[] args) {
        int multiply = 1;
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < x.length; i++) {
            if(x[i]%2!=0){
                multiply = multiply*x[i];
            }
        }
        System.out.println(multiply);
    }
}
