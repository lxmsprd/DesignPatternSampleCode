package patterns.behavior;

public class BuyStock implements Order {
    private Stock mStock;

    public BuyStock(Stock stock) {
        this.mStock = stock;
    }

    @Override
    public void execute() {
        mStock.buy();
    }
}
