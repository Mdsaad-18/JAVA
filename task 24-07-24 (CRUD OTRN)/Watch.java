//3. declare a class to achieve static method overloading and chaining

public class Watch{
	public static void watchDetails(){
   System.out.println("Charger Details");
  //constactor chaining
  Watch.watchDetails("titanic ",10000);
	}
	
	
	public static void watchDetails(String name, int price){
		System.out.println("Watch name is :"+name);
		System.out.println("Watch price is :"+price);

	}
}