public class Parks{
	
	public static void checkParksArea(){
		boolean isParksPresentInArea = true;
		if(isParksPresentInArea){
			System.out.println("Parks is near to our area");
		}else{
			System.out.println("No Parks present here");
		}
	}
	
	public static void parksName(String parkname){
		boolean isParksPresent =true;
		if(isParksPresent){
			System.out.println("The name of the Park is: "+parkname);
		}else{
			System.out.println("nothing");
		}
	}

	public static boolean parkAmount(){
		int ticket= 100;
		if(ticket>500){
			System.out.println("So much Costly");
		}else{
			System.out.println("Its Chip rate");		
		}
		return true;
	}
	
	public static int specialThings(String[] things){
		boolean isParkGood = true;
	    System.out.println("Good things are");
		for(int i= 0 ; i<things.length ; i++){
			System.out.println("-" +things[i]);			
		}
		if(isParkGood){
			System.out.println("Park is actaully good");
		}
		return 1;
	}


}