public class Spotify{
	
	public static void checkSpotify(){
		boolean isSpotifyValide = true;
		if(isSpotifyValide){
			System.out.println("Your Spotify is valide");
		}else{
			System.out.println("Subscribe Your Spotify");
		}
	}
	
	public static void spotifyMusic(String songName){
		boolean isSongAvailable =true;
		if(isSongAvailable){
			System.out.println("Your song is: "+songName+" is playing");
		}else{
			System.out.println("This song is not available in Spotify");
		}
	}

	public static boolean spotifySubscription(){
		String name = "TAUFIQ_RAZA";
		boolean isSubscribe =true;
		if(isSubscribe){
			System.out.println("You can start listning song "+name);
		}else{
			System.out.println("Subscribe your spotify");
		}
		return true;
	}
	
	public static int listOfSongs(String[] songsNames){
			System.out.println("You are songs list is");
		for(int i= 0 ; i<songsNames.length ; i++){
			System.out.println("-" +songsNames[i]);			
		}
		if(songsNames.length>=10){
			System.out.println("Your memory is full & delete songs from list");
		}else{
			System.out.println("make your favourite song list");
		}
		
		return 1;
	}


}