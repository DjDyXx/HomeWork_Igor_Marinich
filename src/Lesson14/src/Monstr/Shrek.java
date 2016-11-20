
package Monstr;

import java.util.Random;

/**
 * Created by Игорь on 19.11.2016.
 */

public class Shrek {
    private final int fullstomach = 100;
    private int stomach = 0;
    private final Random eat = new Random();
    private int stomachAfterEating ;
    private int stomaciffull ;


    public void eating(){
        stomachAfterEating = stomachAfterEating + eat.nextInt(50);
        if (stomachAfterEating>=fullstomach){
            System.out.println("Опасность!Вы попытались накормить шрека еще на "+stomachAfterEating+" ед. пищи.");
            System.out.println("Получилось запихнуть в шрека только " +(stomachAfterEating)+" ед. пищи.");
            System.out.println("Хватит кормить шрека, желудок шрека наполнен на : "+fullstomach+" eд. Желудок шрека полон!");
        }else{
            System.out.println("Шрек поел " + stomachAfterEating + " ед. пищи.");
        }

    }


















    /*public void eating (){
        stomachAfterEating = stomach + stomachAfterEating + eat.nextInt(99) + 1;
        while(fullstomach <= stomachAfterEating) {
            System.out.println("Шрек поел " + stomachAfterEating + " единиц пищи.");
        }if(stomachAfterEating >= fullstomach) {
            System.out.println("Желудок Шрека полон");
        }
    }*/


    /*
    public void eating (){
        stomachAfterEating = stomach + stomachAfterEating + eat.nextInt(99) + 1;
        if(stomachAfterEating >= fullstomach) {
            System.out.println("Желудок Шрека полон");
        }else {
            System.out.println("Шрек поел " + stomachAfterEating + " единиц пищи.");
        }
    }
    */
    /*public void getsout(){
        if(stomachAfterEating == fullstomach) {
            System.out.println("Желудок Шрека полон");
        }else{
            System.out.println(stomachAfterEating);
        }
    }
    */

}
