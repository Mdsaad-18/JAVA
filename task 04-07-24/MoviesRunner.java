public class MoviesRunner{

	public static void main(String args[]){
	
		Movies.checkMovie();
		Movies.checkProfite("Jawan");
		Movies.movieTicketPrice();
		String[] moviesName={"KGF","JAWAN","DHOOM","CHARLIEE_777"};
		Movies.movieList(moviesName,10000);
	
	
	}

}