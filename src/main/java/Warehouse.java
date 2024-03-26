import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        int check = 0;
        for (String key: this.price.keySet()) {
            if (key.equals(product)) {
                check = 1;
            }
        }
        if (check == 0) {
            return -99;
        } else {
            return this.price.get(product);
        }
    }

    public int stock(String product) {
        int check = 0;
        for (String key: this.stock.keySet()) {
            if (key.equals(product)) {
                check = 1;
            }
        }
        if (check == 0) {
            return 0;
        } else {
            return this.stock.get(product);
        }
    }

    public boolean take(String product) {
        if (!this.stock.containsKey(product)) {
            return false;
        }

        int stockAmount = this.stock.get(product);
        
        if (stockAmount > 0) {
            stockAmount--;
            this.stock.put(product, stockAmount);
        }

        if (stockAmount == 0) {
            this.stock.remove(product);
        }
        return true;
    }

    public Set<String> products() {
        return this.stock.keySet();
    }
}
