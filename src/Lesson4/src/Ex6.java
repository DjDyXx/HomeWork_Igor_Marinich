/**
 * Created by Игорь on 09.10.2016.
 *
 * Известно, что если на улице идет дождь, то переменная boolean raining = true, иначе false.
 * Напишите программу, которая выводит настроение человека в зависимости от погоды:
 - если идет дождь и температура воздуха меньше 10 градусов, то настроение грустное
 - если не идет дождь и температура воздуха больше 25 градусов, то настроение хорошее
 - в остальных случаях - настроение нормальное
 Напишите программу с использованием логических операторов в if-условиях

 */
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Вас приветствует программа вашего настроения.");
        System.out.println("Введите температуру на сегодняшний день :");
        Scanner sc1 = new Scanner(System.in);
        int temp = sc1.nextInt();
        System.out.println("Сегодня идёт дождь?(Да или Нет)");
        Scanner sc2 = new Scanner(System.in);
        String rain = sc2.nextLine();
        boolean raining = false;
        int result1 = 0;


        if (rain.equals("Да")){
            raining = true;
        }else if(rain.equals("Нет")){
            raining = false;
        }else {
            result1 = 1;
            System.out.println("Вы ввели не правильное значение.");
        }


        if ((temp < 10)&&(raining)){
            System.out.println("Всвязи с погодой. У вас сегодня будет грустное настроение.");
        }else if((temp > 25)&&(!raining)){
            System.out.println("Всвязи с погодой. У вас сегодня будет хорошее настроение.");
        }else if(result1 == 1){
            System.out.println("Запустите программу заново.");
        }
        else{
            System.out.println("Всвязи с погодой. У вас сегодня будет нормальное настроение.");
        }

    }
}
