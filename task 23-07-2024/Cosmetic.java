/* 3. Cosmetic, Mouse
declare 5 properties and declare 5 methods with condition(condition can be taken on your own)
*/

public class Cosmetic{

	int cosmetic ;
	String[] cosmeticItem;
	String brand;
	double price;
	boolean isQuality;
	
	public void displayItems(){
		String[] cosmeticItem={"lipStick","Powder","border","Eye liner","Nail Polish"};
		for(int i=0; i<cosmeticItem.length; i++){
			System.out.println("- "+cosmeticItem[i]);
		}
	}
	
	public int cosmeticQuantity(){
		this.cosmetic=5;
		System.out.println("Total Cosmetic Items are:"+cosmetic);
		return cosmetic;
	}
	
	public void cosmeticPrice(String brand,double price){
		this.brand=brand;
		this.price=price;
		if(brand == "Green" && price> 5000){
			System.out.println("High Rated Brand:"+brand);
			System.out.println("Total price of Items is: "+price);
		}
	}
	
	public boolean cosmeticDeatils(boolean isQuality){
		this.cosmetic =5;
		this.brand="Wipro";
		this.price=6000;
		this.isQuality=isQuality;
		if(isQuality ==true){
			System.out.println("total cosmetic item:"+cosmetic);
			System.out.println("High Rated Brand:"+brand);
			System.out.println("Total price of Items is: "+price);
			
		}
		return true;
	}
	
	public static void main(String args[]){
		Cosmetic cos= new Cosmetic();
		cos.displayItems();
		cos.cosmeticQuantity();
		cos.cosmeticPrice("Green",8000);
		cos.cosmeticDeatils(true);
	}
}