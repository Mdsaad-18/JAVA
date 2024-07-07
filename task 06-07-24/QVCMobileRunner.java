public class QVCMobileRunner{
	public static void main(String args[]){
	System.out.println("Myntra order list");
	Myntra.shop();
	int totalprice[] = {6000,10000,20000};
	Myntra.cart("Cloths",totalprice);
	Myntra.purchase();
	Myntra.orders("Vivo");
	}

}