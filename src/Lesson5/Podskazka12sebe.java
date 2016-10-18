package Lesson5;

/**
 * Created by Игорь on 18.10.2016.
 */
public class Podskazka12sebe {
    public static void main(String[] args) {
        int n = 123789;
        int a =(n/100000)%10;
        int b=n/10000%10;
        int c = n/1000%10;
        int sum = a+b+c;
        System.out.println(sum);
    }
}
