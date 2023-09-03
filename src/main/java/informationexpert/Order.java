package informationexpert;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Order {
    private List<OrderItem> orderItems;
    private String destinationAddress;

    public int getPrice() {
        int result = 0;

        for (OrderItem orderItem : orderItems) {
            result += orderItem.getPrice();
        }
        return result;
    }
}
