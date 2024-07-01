public class Mobiledetails {

    public static void MobileBrand() {
        String brand = "Samsung";
        System.out.println("The brand of the mobile is: " + brand);
    }

    public static void MobileModel() {
        String model = "Galaxy S21";
        System.out.println("The model of the mobile is: " + model);
    }

    public static void MobileIMEI() {
        String imei = "123456789012345";
        System.out.println("The IMEI number is: " + imei);
    }

    public static void MobileColor() {
        String color = "Phantom Black";
        System.out.println("The color of the mobile is: " + color);
    }

    public static void MobilePrice() {
        double price = 999.99;
        System.out.println("The price of the mobile is: $" + price);
    }
}public class MobileDetailsRunner {

    public static void main(String[] args) {
        
        Mobiledetails.MobileBrand();
        Mobiledetails.MobileModel();
        Mobiledetails.MobileIMEI();
        Mobiledetails.MobileColor();
        Mobiledetails.MobilePrice();
    }
}
