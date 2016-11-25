package Ex2;

/**
 * Created by Игорь on 25.11.2016.
 */
public class ShaurmaKiosk extends ForCommerce {
    public ShaurmaKiosk (String name , String adress, String commerceType, int profit){
        this.adress = adress;
        this.name = name;
        this.commerceType = commerceType;
        this.profit = profit;
    }

    public void whatAreDoing (){
        System.out.println("Мы "+ name + ".");
        System.out.println("Находимся по адрассу "+ adress+ ".");
        System.out.println("Мы " + commerceType + " занимаемся продажей.");
        System.out.println("Наша выручка : " + profit+". Только тсс!! ");
    }
}
