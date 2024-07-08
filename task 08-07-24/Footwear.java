public class Footwear {

    public static void FootwearDetails(String BrandName) {
        System.out.println("The name of the brand: " + BrandName);
    }

    public static void FootwearDetails(String BrandName, float price) {
        System.out.println("The name of the brand: " + BrandName + ", the price: " + price);
    }

    public static void FootwearDetails(String BrandName, float price, int size) {
        System.out.println("The name of the brand: " + BrandName + ", the price: " + price + ", the size is: " + size);
    }

    public static void FootwearDetails(String BrandName, float price, int size, long ownernum) {
        System.out.println("The name of the brand: " + BrandName + ", the price: " + price + ", the size is: " + size + ", the owner number is: " + ownernum);
    }
}
