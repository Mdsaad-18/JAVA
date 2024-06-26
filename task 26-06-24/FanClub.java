//3. create class with static array which has to accept the String elements and check if element is match or not (match value is: "Bengaluru") 

public class FanClub{
	public static String city ="Bengaluru";
	
	public static String cityNames[] ={"Mysore","Mangalore","Gadag","Haveri","Bengaluru"};
	
	public static void main(String args[]){
		
		for(int index=0; index<cityNames.length; index++){
			if(city.equals(cityNames[index])){
				System.out.println("The element is matched with:" +city+" = "+cityNames[index]);
			}else{
				System.out.println("the element is not matched with:"+city+" = "+cityNames[index]);
			}
		}
		
	
	}
}