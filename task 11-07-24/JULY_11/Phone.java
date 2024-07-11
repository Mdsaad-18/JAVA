/* in 5 declare 10 var and assign values to the var using referencing */

public class Phone {

    static String brand;
    static String model;
    static int screenSize;
    static int ramSize;
    static int storageCapacity;
    static String color;
    static double weight;
    static boolean is5GSupported;
    static String operatingSystem;
    static double price;

    public static void main(String[] args) {
        Phone.brand = "Samsung";
        Phone.model = "Galaxy S21 Ultra";
        Phone.screenSize = 6;
        Phone.ramSize = 16;
        Phone.storageCapacity = 512;
        Phone.color = "Phantom Black";
		Phone.is5GSupported = true;
        Phone.operatingSystem = "Android 11";
        Phone.price = 1299.99;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("5G Supported: " + is5GSupported);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Price: $" + price);
    }
}
