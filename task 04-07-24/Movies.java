public class Movies{
	
	public static void checkMovie(){
		boolean isMovieRelease = true;
		if(isMovieRelease){
			System.out.println("Movie is available is market");
		}else{
			System.out.println("Movie is not available is market");
		}
	}
	
	public static void checkProfite(String movieName){
		boolean isMovieHit =true;
		if(isMovieHit){
			System.out.println("the movie: "+movieName+" is super hit");
		}else{
			System.out.println("the movie: "+movieName+" is flopped");
		}
	}

	public static boolean movieTicketPrice(){
		int price =1000;
		if(price>=1000){
			System.out.println("Now go to Movie");
		}else{
			System.out.println("I dont have money to watch movie");
		}
		return true;
	}
	
	public static int movieList(String[] moviesName, long movieProfit){
			System.out.println("You are favourite movies are");
		for(int i= 0 ; i<moviesName.length ; i++){
			System.out.println("-" +moviesName[i]);			
		}
		if(movieProfit>=1000000){
			System.out.println("Block buster movie");
		}else{
			System.out.println("flop movie");
		}
		
		return 1;
	}


}