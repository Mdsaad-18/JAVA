public class Laptop {

    static String brand;
    static String model;
    static int screenSize;
    static int ramSize;
    static int storageCapacity;
    static String color;
    static double weight;
    static boolean isTouchscreen;
    static String operatingSystem;
    static double price;

    public static void main(String[] args) {
        Laptop.brand = "Dell";
        Laptop.model = "XPS 15";
        Laptop.screenSize = 15;
        Laptop.ramSize = 32;
        Laptop.storageCapacity = 1000;
        Laptop.color = "Silver";
        Laptop.weight = 1800.0;
        Laptop.isTouchscreen = true;
        Laptop.operatingSystem = "Windows 11";
        Laptop.price = 1999.99;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Touchscreen: " + isTouchscreen);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Price: $" + price);
    }
}
