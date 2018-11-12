package patterns.behavior;

public class Stock {
    private String name = "car";
    private int quantity = 10;

    public void buy() {
        System.out.println("Buy " + this.toString());
    }

    public void sell() {
        System.out.println("Sell " + this.toString());
    }

    @Override
    public String toString() {
        return "Stock [name:" + name + ", quantity:" + quantity +"]";
    }
}
