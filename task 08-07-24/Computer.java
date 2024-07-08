public class Computer {
    public static void ComputerDetails(String brand) {
        System.out.println("The brand is " + brand);
    }

    public static void ComputerDetails(String brand, float price) {
        System.out.println("The brand is " + brand + ", the price is " + price);
    }

    public static void ComputerDetails(String brand, float price, int ramSize) {
        System.out.println("The brand is " + brand + ", the price is " + price + ", the RAM size is " + ramSize + "GB");
    }

    public static void ComputerDetails(String brand, float price, int ramSize, String processor) {
        System.out.println("The brand is " + brand + ", the price is " + price + ", the RAM size is " + ramSize + "GB, the processor is " + processor);
    }
}
