//2) declare a class to achieve constructor overloading and chaining

public class Charger{
	public Charger(){
		// constructor chaining
		//this.("Lenovo");
		this("Iphone",4000);
		System.out.println("Charger Details");

	}
	public Charger(String name){
		System.out.println("Charger name is :"+name);
	}
	
	public Charger(String name, int price){
		System.out.println("Charger name is :"+name);
		System.out.println("Charger price is :"+price);

	}
}