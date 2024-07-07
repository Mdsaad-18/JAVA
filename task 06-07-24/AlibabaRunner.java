public class AlibabaRunner{
	public static void main(String args[]){
	System.out.println("Alibaba order list");
	Alibaba.shop();
	int totalprice[] = {6000,10000,20000};
	Alibaba.cart("Laptop",totalprice);
	Alibaba.purchase();
	Alibaba.orders("Jeans pant");
	}

}