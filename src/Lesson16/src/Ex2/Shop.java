package Ex2;

/**
 * Created by Игорь on 27.11.2016.
 */
public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product();
        Product product2 = new Product("Телевизор", 100 ,1);
        Product product3 = new Product("Утюг", 20 , 2);
        Product product4 = new Product("Фен", 30 , 3);

        Cart cart1 = new Cart();

        cart1.addProduct(product1);
        cart1.addProduct(product2);
        cart1.addProduct(product3);
        cart1.addProduct(product4);

        System.out.println("Перед очисткой: ");
        cart1.showAll();

        cart1.removeProduct(2);
        System.out.println();
        cart1.showAll();

    }
}
