/**
 * Created by Игорь on 28.10.2016.
 * Выведите элементы массива, которые делятся на 3 без остатка
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < x.length; i++) {
            if(x[i]%3==0){
                System.out.println(x[i]);
            }
        }
    }
}
