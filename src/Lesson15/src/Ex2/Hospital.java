package Ex2;

/**
 * Created by Игорь on 25.11.2016.
 */
public class Hospital extends AdministrativeBuildings {
    public Hospital(String name , String adress,int floors, int copacity, int newOfficesAmount, int garages){
        this.officesAmount = newOfficesAmount;
        this.garagesForSpecialCars = garages;
        this.floors = floors;
        this.adress = adress;
        this.copacity = copacity;
        this.name = name;
    }
}
