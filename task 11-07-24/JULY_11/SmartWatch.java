public class SmartWatch {

    static String brand;
    static String model;
    static double screenSize; // in inches
    static int ramSize; // in GB
    static int storageCapacity; // in GB
    static String color;
    static double weight; // in grams
    static boolean hasHeartRateMonitor;
    static boolean hasGPS;
    static double price; // in dollars

    public static void main(String[] args) {
        SmartWatch.brand = "Apple";
        SmartWatch.model = "Watch Series 7";
        SmartWatch.screenSize = 1.78;
        SmartWatch.ramSize = 1;
        SmartWatch.storageCapacity = 32;
        SmartWatch.color = "Midnight";
        SmartWatch.weight = 36.7;
        SmartWatch.hasHeartRateMonitor = true;
        SmartWatch.hasGPS = true;
        SmartWatch.price = 399.99;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Heart Rate Monitor: " + hasHeartRateMonitor);
        System.out.println("GPS: " + hasGPS);
        System.out.println("Price:" + price);
    }
}
