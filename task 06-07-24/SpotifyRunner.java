public class SpotifyRunner{

		public static void main(String args[]){

		Spotify.user();
		Spotify.premium(500,400);
		Spotify.download("Rap song",true);
		String languages[]={"Kannada","Hindi","English","Telugu"};
		Spotify.value(languages,45);
	}

}