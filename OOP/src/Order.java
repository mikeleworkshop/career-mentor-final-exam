
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String code;
    private final String customer;
    private final List<OrderItem> items;

    Order(String code, String customer) {
        this.code = code;
        this.customer = customer;
        this.items = new ArrayList<>();
    }
}
