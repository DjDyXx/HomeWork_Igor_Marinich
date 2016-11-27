package Ex2;

import java.util.ArrayList;

/**
 * Created by Игорь on 27.11.2016.
 */
public class Cart {
    private ArrayList<Product> products;
    private int count; //текущее количество товаров

    public Cart() {
        count = 0;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (count == 4) { //products.size()???
            System.out.println("Добавить товар невозможно, карзина переполнена.");
        }
        products.add(count, product);
        count++;
    }

    public void removeProduct() {
        if (count == 0) {
            System.out.println("Нельзя удалить товар. В корзине пусто.");
        } else {
            count--;
            products.add(count,null);
        }
    }
    public void removeProduct(int id) {
        if (count == 0) {
            System.out.println("Нельзя удалить товар. В корзине пусто.");
        } else {
            count--;
            products.remove(id);
            for(int k=id; k<count;k++){
                products.get(k);
                //products[k] = products[k+1];
            }
        }
    }

    public void clearAll() {
        for (int i = 0; i < count; i++) {
            products.set(i,null);
        }
        count = 0;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            Product product = products.get(i);
            if (products.get(i) == null){
                product = products.get(i+1);
            }
            System.out.println("Название: " +
                    product.getName());
        }
    }
}
