/**
 * Created by Игорь on 07.11.2016.
 * Найдите сумму всех цифр строки. Учтите, что строка может содержать символы отличные от цифр.
 Например,
 String str = "rw4sd5"; результат: 9

 */
import java.lang.String;
public class Ex1 {
    public static void main(String[] args) {
        String str = "rw4sd5te1";
        int sum = 0;
        for (int i = 0;i< str.length();i++){
            char symbol = str.charAt(i);
            if (Character.isDigit(symbol)){
                sum = sum + Character.getNumericValue(symbol);
            }
        }
        System.out.println(sum);

    }
}
