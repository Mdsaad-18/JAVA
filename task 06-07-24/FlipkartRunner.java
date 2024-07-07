public class FlipkartRunner{
	public static void main(String args[]){
	System.out.println("Flipkart order list");
	Flipkart.shop();
	int totalprice[] = {6000,10000,20000};
	Flipkart.cart("Laptop",totalprice);
	Flipkart.purchase();
	Flipkart.orders("Jeans pant");
	}

}