/* 1. in each class developer needs to declare 3 methods without return type 
and without arguments, in each method it add 5 if statement
Bank
Hotel
Chess
Table
Gmail
T20
*/

public class Bank{
	//method 1
	public static void accountDetails(){
		
		String accountantName= "TAUFIQ RAZA";
		long accountNumber=99875642312L;
		boolean isAccountValid=true;
		float balance= 10000.0f;
		
		if(accountantName=="TAUFIQ RAZA"){
			System.out.println("Welcome dear customer "+accountantName);
		}else{
			System.out.println("Invalide User");	
		}
		
		if(isAccountValid){
			System.out.println("your account is available"+isAccountValid);
		}
		else{
			System.out.println("Unavailable number");
		}
			
		
		if(balance ==0){
			System.out.println("Your account balance is zero");

		}
		else {
			System.out.println("Your account balance is not zero");
		}
			
		
		if(balance <=500){
			System.out.println("Your account balance is Low");
		}
		else{
			System.out.println("Your account balance is High"+balance);
		}
		
		if(accountNumber == 99875642312L){
			System.out.println("is Your account number: "+accountNumber);
		}else{
			System.out.println("You dont have account");
		}
		
	}
	
	
//method 2
	public static void atmMachine(){
		String atmName= "Canara_Bank";		
		String accName= "TAUFIQ RAZA";
		long accountNumber=99875642312L;
		boolean isAccountValid=true;
		float balance= 10000.0f;
		
		if(atmName=="Canara_Bank"){
			System.out.println("we are reached to "+atmName);
		}else{
			System.out.println("we are not reached");	
		}
		
		if(accName=="TAUFIQ RAZA"){
			System.out.println("Welcome dear customer "+accName);
		}else{
			System.out.println("Invalide User");	
		}
		
		if(isAccountValid){
			System.out.println("your account is available"+isAccountValid);
		}
		else{
			System.out.println("Unavailable number");
		}
			
		
		if(balance <=500){
			System.out.println("Your account balance is Low");
		}
		else{
			System.out.println("Your account balance is High"+balance);
		}
		
		if(accountNumber == 99875642312L){
			System.out.println("is Your account number: "+accountNumber);
		}else{
			System.out.println("You dont have account");
		}
		
	}

//method 3
public static void bankDetails(){
		String bankName= "karnataka_bank";		
		String accName= "TAUFIQ RAZA";
		long accountNumber=99875642312L;
		boolean isAccountValid=true;
		String location= "Jayanagar";
		
		if(bankName=="karnataka_bank"){
			System.out.println("we are reached to "+bankName);
		}else{
			System.out.println("we are not reached");	
		}
		
		if(accName=="TAUFIQ RAZA"){
			System.out.println("Welcome dear customer "+accName);
		}else{
			System.out.println("Invalide User");	
		}
		
		if(isAccountValid){
			System.out.println("your account is available"+isAccountValid);
		}
		else{
			System.out.println("Unavailable number");
		}
			
		if(accountNumber == 99875642312L){
			System.out.println("is Your account number: "+accountNumber);
		}else{
			System.out.println("You dont have account");
		}
		
		if(location== "Jayanagar"){
			System.out.println("your location is: "+location);
		}
		else{
			System.out.println("Your are at wrong place");
		}
		
		
	}
	
	

}