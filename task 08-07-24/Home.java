public class Home {

    public static void HomeDetails(String name) {
        System.out.println("The name of the house is " + name);
    }

    public static void HomeDetails(String name, int price) {
        System.out.println("The name of the house is " + name + ", the price of the home is " + price);
    }

    public static void HomeDetails(String name, int price, String location) {
        System.out.println("The name of the house is " + name + ", the price of the home is " + price + ", the location is " + location);
    }

    public static void HomeDetails(String name, int price, String location, long squareFoot) {
        System.out.println("The name of the house is " + name + ", the price of the home is " + price + ", the location is " + location + ", the square foot is " + squareFoot);
    }
}
