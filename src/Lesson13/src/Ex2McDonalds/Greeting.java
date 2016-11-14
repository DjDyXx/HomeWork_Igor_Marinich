package Ex2McDonalds;

import java.util.Scanner;

/**
 * Created by Игорь on 14.11.2016.
 */
public class Greeting {
    public static void Greeting(){
        System.out.println("- Свободная касса!!!");
        System.out.println("- Здравствуйте, готовы сделать ваш заказ?");

        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine(); //Да/Нет
        Order firstOrder = new Order();

        if (order.equals("Да")) {
            System.out.println("- Как я могу к вам обращаться ?");
            String name = sc.nextLine();
            firstOrder.customerName = name;
            System.out.println("- "+firstOrder.customerName +" что будете заказывать из меню?");
            System.out.println("Биг Мак Меню / Чизбургер Меню / Гамбургер Меню");

        } else if (order.equals("Нет")) {
            System.out.println("- Всего хорошего");
        } else {
            System.out.println("Ответьте Да/Нет");
            order = sc.next();
        }

    }
}
