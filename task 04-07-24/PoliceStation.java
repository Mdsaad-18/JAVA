public class PoliceStation{
	
	public static void checkPoliceStation(){
		boolean isStationAvailable = true;
		if(isStationAvailable){
			System.out.println("the police station is availble in our area");
		}else{
			System.out.println("No police stations");
		}
	}
	
	public static void stationName(String stationsName){
		boolean isstationsName =true;
		if(isstationsName){
			System.out.println("Station name is: "+stationsName);
		}else{
			System.out.println("Station name is not valid");
		}
	}

	public static boolean CheckEmployees(){
		int nummberOfEmployee = 15;
		Boolean isExperience= true;
		if(isExperience){
			System.out.println("The Experienced employee is Head of Deaprtment");
		}
		return true;
	}
	
	public static int stationList(String[] stationNames){
		boolean isStationsPresent = true;
	    System.out.println("stations are");
		for(int i= 0 ; i<stationNames.length ; i++){
			System.out.println("-" +stationNames[i]);			
		}
		if(isStationsPresent){
			System.out.println("Dont Fear about anythings");
		}
		return 1;
	}


}