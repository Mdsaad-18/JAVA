public class Computer {

    static String brand;
    static String model;
    static double screenSize; 
    static int ramSize; 
    static int storageCapacity; 
    static String color;
    static double weight; 
    static boolean hasBluetooth;
    static boolean hasWifi;
    static double price; 

    public static void main(String[] args) {
        Computer.brand = "Apple";
        Computer.model = "MacBook Pro";
        Computer.screenSize = 16;
        Computer.ramSize = 16;
        Computer.storageCapacity = 512;
        Computer.color = "Space Gray";
        Computer.weight = 1.4;
        Computer.hasBluetooth = true;
        Computer.hasWifi = true;
        Computer.price = 2399.99;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("Wifi: " + hasWifi);
        System.out.println("Price:" + price);
    }
}
