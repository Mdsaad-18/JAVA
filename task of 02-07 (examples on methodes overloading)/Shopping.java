public class Shopping {

    public static void details(String shoppingType) {
        System.out.println("Shopping Type: " + shoppingType);
    }

    public static void details(double price, double gst) {
        double totalPrice = price + (price * gst / 100);
        System.out.println("Total Price including GST: " + totalPrice);
    }

    public static void details(String itemName, String shoppingType) {
        System.out.println("Item Name: " + itemName + ", Shopping Type: " + shoppingType);
    }

    public static void details(String shoppingType, String itemName, double totalPrice) {
        System.out.println("Shopping Type: " + shoppingType + ", Item Name: " + itemName + ", Total Price: " + totalPrice);
    }
}


