/**
 * Created by Игорь on 19.10.2016.
 * Определите площадь и периметр прямоугольного треугольника,
 * причем их вычисление должно находиться в двух отдельных функциях.
 * Протестируйте функции в главной программе
 */
public class Ex6 {
    public static void main(String[] args) {
        double kat1 = 5;
        double kat2 = 6;
        double gepot = 9;

        double S = area(kat1,kat2);
        double P = perimeter (kat1,kat2,gepot);

        System.out.println("Площадь прямоугольного треугольника = "+S);
        System.out.println("Периметр прямоугольного треугольника = "+P);
    }

    private static double perimeter(double kat1, double kat2, double gepot) {
        double P = (kat1+kat2+gepot);
        return P;
    }

    private static double area(double kat1, double kat2) {
        double S = (kat1+kat2)/2;
        return S;
    }
}
