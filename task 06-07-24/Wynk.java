public class Wynk {

		public static void user(){
			String username = "ABCD";
		String password = "ABHKL@56536";
		System.out.println("Eneter the user name:"+username);
		if(username!=password){
		System.out.println("Entered correct password:"+password);
		}else{
		System.out.println("Forget Password");
		}
	}
		public static void premium(int amount,long goldpremium){
		if(amount>=goldpremium){
		System.out.println("You have successfully subscribed:"+amount);
		}else{
		System.out.println("You have not purchase any premium");
		}
	}
		public static boolean download(String songs,boolean song){
		if(song = true){
		System.out.println("Song successfully downloaded::"+songs);
		}else{
		System.out.println("NO downloads");
		}return true;
	}
		public static int value(String languages[],int num){

		for(int index=0;index<languages.length;index++){
		if(languages.length!=num){
		System.out.println("Select languages are:"+languages[index]);
		}else{
		System.out.println("You have not select any language");
		}
		}	return 35;
	}
}