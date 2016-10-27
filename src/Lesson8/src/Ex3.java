/**
 * Created by Игорь on 28.10.2016.
 * Создайте массив размером n, элементами которого будут числа от n до 1
 */
public class Ex3 {
    public static void main(String[] args) {
        int[]n= new int[5];
        for (int i = n.length-1; i>=0; i--) {
            n[i]=i;
            System.out.println(n[i]);
        }
    }
}
