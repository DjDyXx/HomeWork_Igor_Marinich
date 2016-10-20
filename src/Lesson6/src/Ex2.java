/**
 * Created by Игорь on 19.10.2016.
 * Для чисел a, b и c (с плавающей запятой - тип данных double) найдите сумму, которая будет целым числом (int). Вы должны получить два результата:
 - для округленных значений чисел
 - для чисел преобразованных к int

 */
public class Ex2 {
    public static void main(String[] args) {
        double a,b,c;
        a = 5.6;
        b = 7.4;
        c = 9.6;
        double sumround = Math.round(a+b+c);
        int sumint = (int) (a+b+c);
        System.out.println(sumround);
        System.out.println(sumint);
    }
}
