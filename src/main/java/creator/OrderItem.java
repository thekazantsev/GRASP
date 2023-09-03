package creator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderItem {
    private Good good;
    private int amount;

    public OrderItem(int amount, String name, int price) {
        this.amount = amount;
        this.good = new Good(name, price);
    }

    public int getPrice() {
        return amount * good.getPrice();
    }
}