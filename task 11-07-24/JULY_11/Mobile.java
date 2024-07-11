public class Mobile {

    // Static variables declaration
    public static String brand = "Samsung";
    public static String model = "Galaxy S21";
    public static int storage = 128; // in GB
    public static float screenSize = 6.2f; 

    public static void getSpecifications() {
        String os = "Android";
        System.out.println("Operating System: " + os);

        long batteryCapacity = 4000L; 
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");

        String processor = "Android";
        System.out.println("Processor: " + processor);

        String color = "Phantom Gray";
        System.out.println("Color: " + color);
    }

    public static void setLaunchDetails(int year, long price) {
        int launchYear = year;
        System.out.println("Launch Year: " + launchYear);

        long launchPrice = price; 
        System.out.println("Launch Price:" + launchPrice);
    }

    public static void main(String[] args) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Screen Size: " + screenSize + " inches");

        Mobile.getSpecifications();
        Mobile.setLaunchDetails(2021, 799L);
    }
}
