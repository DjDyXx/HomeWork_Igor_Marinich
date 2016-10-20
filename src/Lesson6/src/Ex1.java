/**
 * Created by Игорь on 19.10.2016.
 * Вычислите значение выражения для чисел a, b и c:
 (cos(a) + sin(b)) / (c + 8) * (b - 5) / sqrt(a)

 */
public class Ex1 {
    public static void main(String[] args) {
         double a,b,c;
        a = 2;
        b = 3;
        c = 1;

        double result = (Math.cos(a)+Math.sin(b)) /(c+8)*(b-5) / Math.sqrt(a);
        System.out.println(result);
    }
}
