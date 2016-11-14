package Ex2McDonalds;

import java.util.Scanner;

/**
 * Created by Игорь on 14.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Greeting.Greeting();

        Set set1 = new Set();
        set1.setName = "Биг Мак Меню";
        set1.price = 68;
        set1.consist = new String[]{"Биг Мак", "Большая Кока Кола", "Большая Картошка Фри"};

        Set set2 = new Set();
        set2.setName = "Чизбургер Меню";
        set2.price = 49;
        set2.consist = new String[]{"Чизбургер", "Средняя Кока Кола", "Средняя Картошка Фри"};

        Set set3 = new Set();
        set3.setName = "Гамбургер Меню";
        set3.price = 43;
        set3.consist = new String[]{"Гамбургер", "Средняя Кока Кола", "Средняя Картошка Фри"};

        Scanner sc = new Scanner(System.in);
        String set = sc.nextLine();

        if (set.equals(set1.setName)) {
            System.out.println("- Вы выбрали : " + set1.setName);
            System.out.print("- Это меню состоит из : ");
            for (int i = 0; i < set1.consist.length; i++) {
                System.out.print(set1.consist[i]+", ");
            }
            System.out.println();
            System.out.println("- С вас : " + set1.price + " грн.");
        }

        if (set.equals(set2.setName)) {
            System.out.println("- Вы выбрали : " + set2.setName);
            System.out.print("- Это меню состоит из : ");
            for (int i = 0; i < set2.consist.length; i++) {
                System.out.print(set2.consist[i]+", ");
            }
            System.out.println();
            System.out.println("- С вас : " + set2.price + " грн.");
        }

        if (set.equals(set3.setName)) {
            System.out.println("- Вы выбрали : " + set3.setName);
            System.out.print("- Это меню состоит из : ");
            for (int i = 0; i < set3.consist.length; i++) {
                System.out.print(set3.consist[i]+", ");
            }
            System.out.println();
            System.out.println("- С вас : " + set3.price + " грн.");
        }

        System.out.println("- Спасибо что без сдачи");
        System.out.println("");
        System.out.println("Спустя 5 минут");
        System.out.println("");
        System.out.println("Вот ваш заказ");

    }
}
