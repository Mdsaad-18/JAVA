public class MeeshooRunner{

	public static void main(String args[]){

    System.out.println("------------------Meeshoo Info:---------------------------");		
	Meeshoo.getinfo();
	Meeshoo.name("Vidit Aatrey");
	System.out.println(Meeshoo.rating());
    String[] head_quartersinformation={"India","Karnataka","Benguluru"};
	String get_inform=Meeshoo.app_details(head_quartersinformation);
	System.out.println(get_inform);	
	System.out.println(Meeshoo.max_rating(5,3));
		}
	}