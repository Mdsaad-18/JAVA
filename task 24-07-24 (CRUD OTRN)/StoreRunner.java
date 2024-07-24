public class StoreRunner{

	public static void main(String args[]){
		
		Store store=new Store();
		int length=store.getStorePriceList();
		System.out.println("length:"+length);
		
		store.insertPrice(30);
		store.insertPrice(50);
		store.insertPrice(60);
		store.insertPrice(70);
		
		store.readItemPrice();
	}

}