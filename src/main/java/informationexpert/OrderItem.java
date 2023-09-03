package informationexpert;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderItem {
    private Good good;
    private int amount;

    public int getPrice() {
        return amount * good.getPrice();
    }
}
