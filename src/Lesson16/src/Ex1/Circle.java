package Ex1;

/**
 * Created by Игорь on 26.11.2016.
 */
public class Circle extends Figure {
    private final double P = 3.1415;
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public void perimetr (){
        System.out.println("Периметр круга за введенными данными : " + P*(radius*radius));
    }

    public void area (){
        System.out.println("Площадь круга за введенными данными : " + 2*P*radius);
    }
}
