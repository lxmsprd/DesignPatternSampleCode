package patterns.behavior;

import java.util.ArrayList;
import java.util.List;

public class Border {
    private List<Order> mOrderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        mOrderList.add(order);
    }

    public void placeOrder() {
        for (Order order: mOrderList) {
            order.execute();
        }
        mOrderList.clear();
    }
}
