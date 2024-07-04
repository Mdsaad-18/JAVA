public class Mall{
	
	public static void checkMallArea(){
		boolean isMallPresentInArea = true;
		if(isMallPresentInArea){
			System.out.println("Mall is near to our area");
		}else{
			System.out.println("No Mall present here");
		}
	}
	
	public static void mallName(String mallname){
		boolean isMallPresent =true;
		if(isMallPresent){
			System.out.println("The name of the mall is: "+mallname);
		}else{
			System.out.println("nothing");
		}
	}

	public static boolean mallFloors(){
		int floor= 5;
		if(floor>=5){
			System.out.println("Big Mall");
		}else{
			System.out.println("Small Mall");		
		}
		return true;
	}
	
	public static int specialThings(String[] items){
		boolean isMallGood = true;
	    System.out.println("Special things are");
		for(int i= 0 ; i<items.length ; i++){
			System.out.println("-" +items[i]);			
		}
		if(isMallGood){
			System.out.println("mall is actaully good");
		}
		return 1;
	}


}