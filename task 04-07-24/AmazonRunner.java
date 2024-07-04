public class AmazonRunner {

    public static void main(String[] args) {
        Amazon.AmazonPrime();
        Amazon.Shopping("Laptop");
        int price = Amazon.productPrice();
        System.out.println("Product Price: " + price);
        String[] productList = {"Laptop", "Mobile", "Tablet"};
        Amazon.productName(productList);
    }
}
