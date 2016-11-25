package Ex2;

/**
 * Created by Игорь on 25.11.2016.
 */
public class FireDepartment extends AdministrativeBuildings {
    public FireDepartment(String name , String adress,int floors, int copacity, int newOfficesAmount, int garages){
        this.officesAmount = newOfficesAmount;
        this.garagesForSpecialCars = garages;
        this.floors = floors;
        this.adress = adress;
        this.copacity = copacity;
        this.name = name;
    }


    /*
    public void welcomeAndSupporting(){
        System.out.println("Мы " + name + ". Рады приветствовать вас.");
        System.out.println("Краткое описание нашего отдела: ");
        System.out.println("Адресс : " + adress);
        System.out.println("Этажей : " + floors);
        System.out.println("Вместимость : " + copacity);
        System.out.println("Офиссов : " + officesAmount);
        System.out.println("Гаражей для специальных машин : " + garagesForSpecialCars);
    }
    */
}
