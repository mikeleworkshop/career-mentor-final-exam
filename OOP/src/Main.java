public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct("Iphone", 1000);
        inventory.addProduct("Laptop", 800);

        inventory.updateStock("Iphone", 10);
        inventory.updateStock("Laptop",10);
        inventory.updateStock("Laptop", -5);
        inventory.updateStock("Tablet", 5);
    }
}
