public class Cars{
	
	public static void checkCarShowRoom(){
		boolean isCarShowRoomAvailabele = true;
		if(isCarShowRoomAvailabele){
			System.out.println("car ShowRoom is near to our area");
		}else{
			System.out.println("No car showroom present here");
		}
	}
	
	public static void carBrand(String carName){
		boolean isCarGood =true;
		if(isCarGood){
			System.out.println("The name of the car is: "+carName);
		}else{
			System.out.println("balleno");
		}
	}

	public static boolean carDeatils(){
		int millege= 100; //kmh-1
		if(millege>=80){
			System.out.println("Good millage");
		}else{
			System.out.println("Lets look next car");		
		}
		return true;
	}
	
	public static int carList(String[] car){
		boolean isCarsAvailable= true;
	    System.out.println("Special things are");
		for(int i= 0 ; i<car.length ; i++){
			System.out.println("-" +car[i]);			
		}
		if(isCarsAvailable){
			System.out.println("i purchased a car");
		}
		return 1;
	}


}