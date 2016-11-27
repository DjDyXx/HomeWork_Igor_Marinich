package Ex1;

/**
 * Created by Игорь on 26.11.2016.
 */
public class Square extends Figure{
    private int side;
    public Square (int side){
        this.side = side;
    }
    public void perimetr (){
        System.out.println("Периметр квадрата за введенными данными : " +4*side);
    }

    public void area (){
        System.out.println("Площадь квадрата за введенными данными : " + side*side);
    }
}
