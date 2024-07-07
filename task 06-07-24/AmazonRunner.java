public class AmazonRunner{
	public static void main(String args[]){
	System.out.println("Amazon order list");
	Amazon.shop();
	int totalprice[] = {6000,10000,20000};
	Amazon.cart("Laptop",totalprice);
	Amazon.purchase();
	Amazon.orders("Jeans pant");
	}

}