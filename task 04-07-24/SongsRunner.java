public class SongsRunner{

	public static void main(String args[]){
	
		Songs.checkSongsList();
		Songs.songsPlaying("Kahani Suno 3.0");
		Songs.songDownload();
		String[] songsPlatforms={"AmaozonMusic","Spotify","rinex","Ganna"};
		Songs.listOfSongsPlatforms(songsPlatforms);
	
	
	}

}