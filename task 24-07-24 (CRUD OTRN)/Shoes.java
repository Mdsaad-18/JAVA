//4. declare a class to achieve instance method overloading and chaining.

public class Shoes{
	
	public  void shoesDetails(){
   System.out.println("Shoes Details");
  //constactor chaining
  this.shoesDetails("puma",12000);
	}
	
	
	public  void shoesDetails(String name, int price){
		System.out.println("Shoes name is :"+name);
		System.out.println("Shoes price is :"+price);
		  


	}
}