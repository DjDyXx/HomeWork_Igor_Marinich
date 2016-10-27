/**
 * Created by Игорь on 28.10.2016.
 * Выведите все четные элементы массива

 */
public class Ex5 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < x.length; i++) {
            if(x[i]%2==0){
                System.out.println(x[i]);
            }
        }
    }
}
