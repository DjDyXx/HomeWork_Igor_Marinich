package Ex1;

/**
 * Created by Игорь on 26.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Вас приветствует программа подсчета периметра и площади фигур.");

        Rectangle r1 = new Rectangle(10,15,10,15);
        Circle c1 = new Circle(5);
        Square s1 = new Square(6);


        Figure[] figures = new Figure[3];
        figures[0] = r1;
        figures[1] = c1;
        figures[2] = s1;

        for (Figure fig : figures){
            fig.perimetr();
            fig.area();
            System.out.println();
        }
    }
}
