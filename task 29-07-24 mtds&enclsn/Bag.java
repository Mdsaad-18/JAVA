/*1. create a class with 4 properties and make it public,
assign values using constructor and display,*/

 public class Bag{
	 // declaring 4 properties
	 public String bagCompanyName;
	 public int bagPrice;
	 public String bagColor;
	 public boolean isBagQuality;
	 
	 public Bag(String bagCompanyName,int bagPrice,String bagColor, boolean isBagQuality){
		 this.bagCompanyName=bagCompanyName;
		 this.bagPrice=bagPrice;
		 this.bagColor=bagColor;
		 this.isBagQuality=isBagQuality;

	 }
	 
	 public static void main(String args[]){
		Bag bagdetails = new Bag("Lenovo",1200,"Black",true);
		
		// String bagCompanyName=bagdetails.bagCompanyName="Lenovo";
		System.out.println("the bagCompanyName is " +bagdetails.bagCompanyName);
		
		//int bagPrice=bagdetails.bagPrice=1200;
		System.out.println("the bagPrice is "+bagdetails.bagPrice);
		
		//String bagColor=bagdetails.bagColor="Black";
		System.out.println("the bag color is " +bagdetails.bagColor);
		
		//boolean isBagQuality=bagdetails.isBagQuality=true;
		System.out.println("the quality of is " +bagdetails.isBagQuality);		

	 }
 }
