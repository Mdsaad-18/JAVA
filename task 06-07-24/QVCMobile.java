public class QVCMobile {

	public static void shop(){
	String shoppingtype = "online";
	System.out.println("Shopping in :"+shoppingtype); 
	int bill = 3000;
	byte items = 2;
	if(bill>items){
	System.out.println("Your shopped with :"+bill+"rs");
	}
	System.out.println("You Cart is empty");
	}
	public static void cart(String item, int totalprice[]){
	System.out.println("Shopping item is:"+item);
	for(int carry=0;carry<totalprice.length;carry++){
	if(totalprice[carry]<=30000){
	System.out.println("Cart items are:"+totalprice[carry]);
	}else{
	System.out.println("your cart is empty");
	}
	}
	}
	public static int purchase(){
	int amount[]={14000,13000,10000,16000};
	String phone = "Oppo";
	System.out.println("You Purchased new phone:"+phone);
	for(int index=0;index<amount.length;index++){
	if(amount[index]<20000){
	System.out.println("Your phone Price is:"+amount[index]);
	}else{
	System.out.println("You have not purchase any phone");
	}
	}return 5;
	}
	public static int orders(String name){
	int orders =2;
	System.out.println("You purchased phone was:"+name);
	if(orders>2){
	System.out.println("Your ordered items are:"+orders);
	}return 4;
	}
	}