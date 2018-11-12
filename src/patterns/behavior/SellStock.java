package patterns.behavior;

public class SellStock implements Order{
    private Stock mStock;

    public SellStock(Stock stock) {
        this.mStock = stock;
    }

    @Override
    public void execute() {
        mStock.sell();
    }
}
