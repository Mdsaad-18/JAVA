public class Pubs{
	
	public static void checkPubsArea(){
		boolean isPubsPresentInArea = true;
		if(isPubsPresentInArea){
			System.out.println("Pubs is near to our area");
		}else{
			System.out.println("No Pubs present here");
		}
	}
	
	public static void pubsName(String pubsname){
		boolean isPubsPresent =true;
		if(isPubsPresent){
			System.out.println("The name of the mall is: "+pubsname);
		}else{
			System.out.println("nothing");
		}
	}

	public static boolean pubsFloors(){
		int floor= 5;
		if(floor>=5){
			System.out.println("Big Pubs");
		}else{
			System.out.println("Small Pubs");		
		}
		return true;
	}
	
	public static int specialThings(String[] items){
		boolean isPubsGood = true;
	    System.out.println("Special things are");
		for(int i= 0 ; i<items.length ; i++){
			System.out.println("-" +items[i]);			
		}
		if(isPubsGood){
			System.out.println("Pubs is actaully good");
		}
		return 1;
	}


}