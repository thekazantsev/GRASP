package creator;

import java.util.ArrayList;

public class Client {
    public void doSmth() {
        int amount = 2;
        String name = "good";
        int price = 0;

        Order order = new Order("address");
        order.addOrderItem(amount, name, price);
        // client code
    }
}
