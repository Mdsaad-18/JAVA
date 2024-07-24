/* 6. Write a program to store the prices and
 the developer needs to Perform the Create and Read operation*/

public class Store{
	
	int[] prices= new int[4];
	int index=0;
	public int getStorePriceList(){
		return prices.length;
	}
	
	public String insertPrice(int itemPrice){
		if(this.index<this.getStorePriceList()){
			prices[index]=itemPrice;
			index++;
		}else{
			System.out.println("The Shop Items are OverLoaded");
		}
		return "The item price is added successfully";
	}
	
	public void readItemPrice(){
		for(int i=0; i<prices.length; i++){
			System.out.println("-"+prices[i]);
		}
	}

}