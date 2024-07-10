/*1.class Food, in that write a method, which has to accept the FoodItemName and Quantity
display 20 foodItemName with quantity and Price(price can taken has local variable)
Ex: quantity is 2
price is 10
total price is: 20
need to print for all 20 FoodItems*/

public class Foods{
	 public static void main(String args[]){
		 
		 String FoodItemName[] = {"idli","dosa","rice","biriyani","friedrice","popcorn","eggrice","whiterice"
		 ,"redrice","dahirice","puri","lemonrice","vada","utappa","juice","lassi","limbosoda","masaldosa",
		 "aulakki","upittu"};
		 
		 int Quantity[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 
		 int price[] = {30,40,50,60,70,80,90,100,15,16,17,88,99,52,55,88,99,55,100,52};
		 
		 for (int i=0;  i<FoodItemName.length; i++){
			 System.out.println("");

System.out.println("the FoodItemName  "+FoodItemName[i]);
System.out.println("the Quantity  "+Quantity[i]);
System.out.println("the price  "+ price[i]);
		 

int sum = Quantity[i]*price[i];
System.out.println("the total sum"+sum);
System.out.println("");

		 }
		 }
	 }
