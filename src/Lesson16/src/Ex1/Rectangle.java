package Ex1;

/**
 * Created by Игорь on 26.11.2016.
 */
public class Rectangle extends Figure{
    private int side1;
    private int side2;
    private int side3;
    private int side4;
    public Rectangle (int side1,int side2,int side3,int side4){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public void perimetr (){
        System.out.println("Периметр прямоугольника за введенными данными : " + 2*(side1+side2));
    }

    public void area (){
        System.out.println("Площадь прямоугольника за введенными данными : " + side1*side2);
    }
}
