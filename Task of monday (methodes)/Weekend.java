public class Weekend{
	
	public static final double gst =0.18;
	
	public static void getGst(int price){
		double totalPrice= Weekend.gst*price+price;
		System.out.println("Total Price: "+totalPrice);
	}

}