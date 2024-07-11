public class SocialMedia{

	//static variables declaration
	public static String profileName= "Taufiq Raza";
	public static int followers= 500;
	public static int following = 400;
	public static float post = 10f;
	
	public static void getPlatform(){
		String name = "Instagram";
		System.out.println("name:"+name);
		
		long activeUsers = 1000000L;
		System.out.println("activeUsers:"+activeUsers);

		String ceo = "Jane";
		System.out.println("ceo:"+ceo);

		String headQuaters = "Green Valey";
		System.out.println("headQuaters:"+headQuaters);	
	}
	
	public static void setLaunchYear(int year, long revenue){
		int launchYear = year;
		System.out.println("launchYear:"+launchYear);	

		long totalRevenue = revenue;
		System.out.println("totalRevenue:"+totalRevenue);			
	}
	
	public static void main(String args[]){
		System.out.println("profileName:"+profileName);
		System.out.println("followers:"+followers);
		System.out.println("following:"+following);
		System.out.println("post:"+post);
		
		SocialMedia.getPlatform();
		SocialMedia.setLaunchYear(2010,200000L);
	}
}