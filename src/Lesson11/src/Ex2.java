/**
 * Created by Игорь on 07.11.2016.
 * Усовершенствуйте калькулятор, который выполняет 4 операции над числами при том условии, что выражение записано в строке.
 * Например,
 * String str = "345+1234"; результат: 1579
 * String str = "3-8"; результат: -5
 * Первым действием определите позицию (индекс) операции в строке
 * Вторым действием с помощью функции substring получите первое и второе число
 */
public class Ex2 {
    public static void main(String[] args) {
        String str = "2255+45";
        char operation = str.charAt(positionOperation(str));
        int firstNumber = getFirstNumber(str, operation);
        int secondNumber = getSecondNumber(str, operation);
        int math = mathCalculate(firstNumber, secondNumber, operation);
        System.out.println(math);
    }


    private static int mathCalculate(int firstNumber, int secondNumber, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
        }

        return result;
    }


    private static char positionOperation(String str) {
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
                return (char) i;
            }
        }
        return 0;
    }

    private static int getFirstNumber(String str, char operation) {
        String firstNumber = str.substring(0, positionOperation(str));
        int number = Integer.parseInt(firstNumber);
        return number;
    }


    private static int getSecondNumber(String str, char operation) {
        String secondNumber = str.substring(positionOperation(str)+1, str.length());
        int number = Integer.parseInt(secondNumber);
        return number;
    }
}
