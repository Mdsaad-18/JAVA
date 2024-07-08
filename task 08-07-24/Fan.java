public class Fan {

    public static void FanDetails(String BrandName) {
        System.out.println("The Brandname: " + BrandName);
    }

    public static void FanDetails(String BrandName, int price) {
        System.out.println("The Brandname: " + BrandName + ", The price: " + price);
    }

    public static void FanDetails(String BrandName, int price, float speed) {
        System.out.println("The Brandname: " + BrandName + ", The price: " + price + ", The speed: " + speed);
    }

    public static void FanDetails(String BrandName, int price, float speed, int numOfBlades) {
        System.out.println("The Brandname: " + BrandName + ", The price: " + price + ", The speed: " + speed + ", The number of blades: " + numOfBlades);
    }
}
