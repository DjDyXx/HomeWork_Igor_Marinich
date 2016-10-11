import java.util.Scanner;

/**
 * Created by Игорь on 09.10.2016.
 *   Напишите простой калькулятор (желательно с помощью switch):
    Входные данные:
    int operand1 = какое-то число (можно вводить из консоли)
    int operand2 = какое-то число (можно вводить из консоли)
    String operation = "+"; (могут быть "-", "/", "*", "%", "модуль", "квадрат") - для последних двух учитывать только первый операнд
 */
public class Ex8 {
    public static void main(String[] args) {

        int operand2 = 0;
        int result;

        System.out.println("Введите 1ое число :");
        Scanner sc1 = new Scanner(System.in);
        int operand1 = sc1.nextInt();

        System.out.println("Введите какую мат.операцию вы собираетесь сделать(могут быть \"+\", \"-\", \"/\", \"*\", \"%\", \"модуль\", \"квадрат\") :");
        Scanner sc3 = new Scanner(System.in);
        String math = sc3.nextLine();

        if (!(math.equals("модуль") || math.equals("квадрат"))) {
            System.out.println("Введите 2ое число :");
            Scanner sc2 = new Scanner(System.in);
            operand2 = sc2.nextInt();
        }



        switch(math){
            case "+":
                result = operand1 + operand2;
                System.out.println("Результат : " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Результат : " + result);
                break;
            case "/":
                result = operand1 / operand2;
                System.out.println("Результат : " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Результат : " + result);
                break;
            case "%":
                result = operand1 % operand2;
                System.out.println("Результат : " + result);
                break;
            case "модуль":
                if (operand1 < 0){
                    System.out.println("Результат : " + -operand1);
                }else
                    System.out.println("Результат : " + operand1);
                break;
            case "квадрат":
                result = operand1*operand1;
                System.out.println("Результат : " + result);
                break;
            default:
                System.out.println("Вы ввели не правильное значение");
        }
    }
}
