package ShopCart;

/**
 * Created by Игорь on 18.11.2016.
 */
public class Cart {
    private Product[] products;
    private int count; //текущее количество товаров

    public Cart() {
        count = 0;
        products = new Product[4];
    }

    public void addProduct(Product product) {
        if (count == products.length) {
            System.out.println("Добавить товар невозможно, карзина переполнена.");
        }
        products[count] = product;
        count++;
    }

    public void removeProduct() {
        if (count == 0) {
            System.out.println("Нельзя удалить товар. В корзине пусто.");
        } else {
            count--;
            products[count] = null;
        }
    }
    public void removeProduct(int id) {
        if (count == 0) {
            System.out.println("Нельзя удалить товар. В корзине пусто.");
        } else {
            count--;
            products[id] = null;
            for(int k=id; k<count;k++){
                products[k] = products[k+1];
            }
        }
    }

    public void clearAll() {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            Product product = products[i];
            if (products[i] == null){
                product = products[i+1];
            }
            System.out.println("Название: " +
                    product.getName());
        }
    }
}
