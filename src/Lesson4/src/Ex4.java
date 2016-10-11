import java.util.Scanner;

/**
 * Created by Игорь on 09.10.2016.
 * Разделите число "a" на число "b". Учтите вариант, при котором нельзя поделить одно число на другое
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Введите 1ое число :");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Введите 2ое число :");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        if((a == 0) ||(b == 0)){
            System.out.println("Нельзя делить на 0!");
        }else{
            int result = a/b;
            System.out.println("Результат = "+ result);
        }
    }
}
