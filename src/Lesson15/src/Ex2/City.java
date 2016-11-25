package Ex2;

/**
 * Created by Игорь on 25.11.2016.
 */
public class City {
    public static void main(String[] args) {

        Hospital h1 = new Hospital("GospitalImeniIgora","Filatova , 3", 5,1000,10,15);
        h1.welcome();

        System.out.println();

        FireDepartment f1 = new FireDepartment("FireDepartment №1","Gagarina , 51", 2,120,5,10);
        f1.welcome();
        System.out.println();

        Houses house = new Houses("MyHouse","Ichaka Rabina 52","Malenovskui",2);
        house.howLiveInThisHouse();
        System.out.println();

        ShaurmaKiosk kiosk1 = new ShaurmaKiosk("Shaurman","Generala Petrova , 21","kiosk",3900);
        kiosk1.whatAreDoing();
    }
}
