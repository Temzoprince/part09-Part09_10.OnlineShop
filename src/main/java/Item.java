public class Item {
    private String name;
    private int qty;
    private int price;

    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.qty = qty;
        this.price = unitPrice;
    }

    public int price() {
        return this.price * this.qty;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.qty;
    }
}
