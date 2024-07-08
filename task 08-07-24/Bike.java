public class Bike {
    public static void BikeDetails(String company) {
        System.out.println("The company is " + company);
    }

    public static void BikeDetails(String company, float price) {
        System.out.println("The company is " + company + ", the price is " + price);
    }

    public static void BikeDetails(String company, float price, int numOfGears) {
        System.out.println("The company is " + company + ", the price is " + price + ", the number of gears is " + numOfGears);
    }

    public static void BikeDetails(String company, float price, int numOfGears, String brakeType) {
        System.out.println("The company is " + company + ", the price is " + price + ", the number of gears is " + numOfGears + ", the brake type is " + brakeType);
    }
}
