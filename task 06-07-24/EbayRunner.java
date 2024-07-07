public class EbayRunner{
	public static void main(String args[]){
	System.out.println("Ebay order list");
	Ebay.shop();
	int totalprice[] = {6000,10000,20000};
	Ebay.cart("Laptop",totalprice);
	Ebay.purchase();
	Ebay.orders("Jeans pant");
	}

}