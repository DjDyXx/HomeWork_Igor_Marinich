import java.util.Scanner;

/**
 * Created by Игорь on 09.10.2016.
 * Посчитайте результат вычисления формулы (сделайте с помощью switch):
    result = x * x + 5; при x = 5;
    result = x - 8; при x = 9;
    result = x + 9; при x = 12;
    result = x - 5 + x / 8; при x = 17;
    result = x + x + x; при x = 25;
    в остальных случаях result = 0

 */
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Введите число х :");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int result;

        switch(x){
            case 5:
                result = (x - 8);
                System.out.println(result);
                break;
            case 9:
                result = (x + 9);
                System.out.println(result);
                break;
            case 12:
                result = (x - 5 + x);
                System.out.println(result);
                break;
            case 17:
                result = (x * x + 5);
                System.out.println(result);
                break;
            case 25:
                result = (x + x + x);
                System.out.println(result);
                break;
            default: result = 0;
                System.out.println(result);
        }
    }
}
