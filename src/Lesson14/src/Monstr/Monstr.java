package Monstr;

/**
 * Created by Игорь on 19.11.2016.
 */
public class Monstr {
    public static void main(String[] args) {
        Shrek shrek = new Shrek();
        System.out.println("Попытка накормить монстра № 1.");
        shrek.eating();
        System.out.println();
        System.out.println("Попытка накормить монстра № 2.");
        shrek.eating();
        System.out.println();
        System.out.println("Попытка накормить монстра № 3.");
        shrek.eating();
    }
}
