public class ShoppingRunner {

    public static void main(String[] args) {
        Shopping.details("Groceries");
        Shopping.details(1000.0, 5.0); // Price = 1000, GST = 5%
        Shopping.details("Milk", "Groceries");
        Shopping.details("Electronics", "Laptop", 55000.0);
    }
}