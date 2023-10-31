package example1.loose_coupling;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product milk = new Milk();

        productList.add(milk);

        ShoppingCart shoppingCart = new ShoppingCart(productList);

    }
}
