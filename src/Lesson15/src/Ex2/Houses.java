package Ex2;

/**
 * Created by Игорь on 25.11.2016.
 */
public class Houses extends ForLive {
    public Houses (String name , String adress, String wkh, int corpus){
        this.adress = adress;
        this.name = name;
        this.wkh = wkh;
        this.corpus = corpus;
    }

    public void howLiveInThisHouse (){
        System.out.println("Это "+ name + ".");
        System.out.println("Находится по адрессу :  "+ adress+ ".");
        System.out.println("Корпус " +corpus+".");
        System.out.println("У моего дома " + wkh + " ЖКХ.");

    }
}
