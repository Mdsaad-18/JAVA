public class SpotifyRunner{

	public static void main(String args[]){
	
		Spotify.checkSpotify();
		Spotify.spotifyMusic("Kahani Suno 3.0");
		Spotify.spotifySubscription();
		String[] songsNames={"kahani_Suno","DJ","PushPa","Kavaliya"};
		Spotify.listOfSongs(songsNames);
	
	
	}3

}