package Ex2;

/**
 * Created by Игорь on 25.11.2016.
 */
public class AdministrativeBuildings extends Buildings {
    protected int officesAmount;
    protected int garagesForSpecialCars;

    public void welcome(){
        System.out.println("Мы " + name + ". Рады приветствовать вас.");
        System.out.println("Краткое описание нашего отдела: ");
        System.out.println("Адресс : " + adress);
        System.out.println("Этажей : " + floors);
        System.out.println("Вместимость : " + copacity);
        System.out.println("Офиссов : " + officesAmount);
        System.out.println("Гаражей для специальных машин : " + garagesForSpecialCars);
    }
}
