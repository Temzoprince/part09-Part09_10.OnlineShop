import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!this.cart.containsKey(product)) {
            this.cart.put(product, new Item(product, 1, price));
        } else {
            Item item = this.cart.get(product);
            item.increaseQuantity();
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : this.cart.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }
}
