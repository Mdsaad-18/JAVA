public class SheinRunner{
	public static void main(String args[]){
	System.out.println("Shein order list");
	Shein.shop();
	int totalprice[] = {6000,10000,20000};
	Shein.cart("Laptop",totalprice);
	Shein.purchase();
	Shein.orders("Jeans pant");
	}

}