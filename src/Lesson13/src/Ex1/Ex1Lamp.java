package Ex1;

/**
 * Created by Игорь on 13.11.2016.
 */
public class Ex1Lamp {
    String name;
    int battery;
    String color;
    int lmVat;
    String type;
    int power;

    public String LampColor() {
        if (battery == 1) {
            color = "Белый";
            return color;
        } else if (battery == 2) {
            color = "Красный";
            return color;
        } else if (battery == 3) {
            color = "Мерцающий";
            return color;
        }
        return color = "Нужно больше или меньше батареек для того что бы лампа работала.";
    }

    public String Type() {
        if (lmVat >= 4 && lmVat <= 13) {
            return type = "Лампа накаливания.";
        } else if (lmVat > 3 && lmVat < 14) {
            return type = "Галогенная лампа накаливания.";
        } else if (lmVat > 14 && lmVat < 18) {
            return type = "Люминесцентная лампа.";
        } else if (lmVat > 49 && lmVat < 58) {
            return type = "Металлогалогенная газоразрядная лампа.";
        } else if (lmVat > 78 && lmVat < 106) {
            return type = "Индукционная лампа.";
        } else if (lmVat > 109 && lmVat < 114) {
            return type = "Натриевая газоразрядная лампа.";
        } else if (lmVat > 114 && lmVat < 117) {
            return type = "Светодиод.";
        }
        return type = "Наша база данных не знает этот тип ламп.";
    }
}