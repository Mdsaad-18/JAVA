public class Amazon {

    public static void AmazonPrime() {
        boolean isPrimeVideo = true;
        if (isPrimeVideo) {
            System.out.println("Video is valid up to 30 days");
        } else {
            System.out.println("Video is expired! The user needs to recharge");
        }
    }

    public static void Shopping(String shoppingProduct) {
        boolean isProductAvailable = false;
        if (isProductAvailable) {
            System.out.println("The product is available");
        } else {
            System.out.println("The product is out of stock");
        }
    }

    public static int productPrice() {
        int productPrice = 1000;
        if (productPrice < 1000) {
            System.out.println("The product price is less than 1000");
        } else {
            System.out.println("The product price is greater than or equal to 1000");
        }
        return productPrice;
    }

    public static void productName(String[] productsName) {
        boolean isAvailable = true;
        for (String product : productsName) {
            System.out.println("Product: " + product);
        }
        if (isAvailable) {
            System.out.println("The product is available");
        } else {
            System.out.println("The product is out of stock, sorry");
        }
    }
}

