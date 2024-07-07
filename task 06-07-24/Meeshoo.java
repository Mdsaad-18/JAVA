public class Meeshoo{
	public static void getinfo(){
			boolean getinfo=true;
			if (getinfo){
				System.out.println("Online Shopping App");
			}else{
				System.out.println("Not Online Shopping App");
			}
		}
		public static void name(String name){
			boolean founders=true;
			if (founders){
				System.out.println("Founder name is:"+name);
			}else{
				System.out.println("No Name");
			}
		}
		
		public static  int rating(){
			int rating=7;
			
			if (rating==5){
				System.out.println("Meesho Is Not A Good Application For Money Transaction App ");
				
			return 1;	
			}else{
				System.out.println("Meesho Is  A Good Application For Money Transaction App");
			return 2;	
			}
			
		}
		public static String app_details(String headquarters_details[]){
			for(int index=0;index<headquarters_details.length;index++)
			{
				System.out.println(headquarters_details[index]);
			}
			return "End of headquarters_details";
			
		}
		public static int max_rating(int a, int b) {
        
        if (a > b) {
			System.out.println("Meesho Is Not Usable App");
            return a;  
        } else {
			System.out.println("Meesho Is A Usable App");
            return b;  
        }
    }




}