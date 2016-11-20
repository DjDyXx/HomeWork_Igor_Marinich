package ShopCart;

/**
 * Created by Игорь on 18.11.2016.
 */
public class Product {
    private String name;
    private int price;
    private int id;

    public Product() {
        name = "Неизвестный товар";
        price = -1;
        id = -1;
    }

    public Product(String newName, int newPrice ,int newId) {
        name = newName;
        price = newPrice;
        id = newId;
    }

    public String getName() {
        return name;
    }
}
