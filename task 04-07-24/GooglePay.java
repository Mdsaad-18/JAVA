public class GooglePay{
	
	public static void accountValid(){
		String name = "TAUFIQ RAZA";
		String gmail= "taufiq.xworkz@gmail.com";
		boolean isValide= gmail.endsWith("gmail.com");
		if(isValide){
			System.out.println("Welcome to PhonePay "+name);
		}else{
			System.out.println("username is incorrect");
		}
	}
	
	public static void amountTransact(int amount, String name){
		boolean isAmountPresent =true;
		if(isAmountPresent){
			System.out.println("you transaction amount is "+amount);
			System.out.println("you transact to the "+name);			
		}else{
			System.out.println("your balance is low");
		}
	}

	public static boolean amountReceived(){
		int amount =10000;
		boolean isAmountReceive = true;
		if(isAmountReceive){
			System.out.println("You received: "+amount);
		}else{
			System.out.println("You not rreceived anything");
		}
		return true;
	}
	
	public static int transactionHistory(int Pincode, double[] historyOfTranscation){
		int correctPin = 6767;
		
		if(Pincode == correctPin){
			System.out.println("the tranction history is");
			for(int i= 0 ; i<historyOfTranscation.length ; i++){
			System.out.println("-" +historyOfTranscation[i]);			
		    }
		}else{
			System.out.println("You enterned wrong pin");
		}
		
		return 1;
	}


}