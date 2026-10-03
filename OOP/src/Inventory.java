import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Product> storage = new HashMap<>();

    public boolean addProduct(String name, double price) {
        if (name == null || price < 0) {
            System.out.println("Product name must not be empty. Price must be larger than 0.");
            return false;
        }

        String productName = name.trim().toLowerCase();
        if (storage.containsKey(productName)) {
            System.out.println("Product already exists!");
            return false;
        }

        Product product = new Product(productName, price);
        storage.put(productName, product);
        System.out.println("Product added: " + product);
        return true;
    }

    public boolean updateStock(String name, int stock) {
        if (name == null) {
            System.out.println("Product name must not be empty.");
            return false;
        }

        String productName = name.trim().toLowerCase();
        if (!storage.containsKey(productName)) {
            System.out.println("Product does not exist!");
            return false;
        }

        if (stock < 0) {
            stock = 0;
        }

        Product product = storage.get(productName);
        product.setStock(stock);
        storage.put(productName, product);
        System.out.println("Stock updated: " + product);
        return true;
    }
}
