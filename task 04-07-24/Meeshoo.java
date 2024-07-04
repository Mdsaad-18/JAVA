public class Meeshoo{
	
	public static void meshooLogin(){
		boolean isLogin = true;
		if(isLogin){
			System.out.println("Start Your Shopping Now");
		}else{
			System.out.println("Login to purchase anuthing");
		}
	}
	
	public static void meeshoMusic(String songName){
		boolean isSongAvailable =true;
		if(isSongAvailable){
			System.out.println("Your song is: "+songName+" is playing");
		}else{
			System.out.println("This song is not available");
		}
	}

	public static boolean meeshoPay(){
		int balance =1000;
		if(balance>=500){
			System.out.println("You can shop now");
		}else{
			System.out.println("Your Balance is low");
		}
		return true;
	}
	
	public static int meeshoShopping(String[] itemNames, int itemPrice){
			System.out.println("You are shopped items are");
		for(int i= 0 ; i<itemNames.length ; i++){
			System.out.println("-" +itemNames[i]);			
		}
		if(itemPrice>=5000){
			System.out.println("Heavy shopping");
		}else{
			System.out.println("You perchased something");
		}
		
		return 1;
	}


}