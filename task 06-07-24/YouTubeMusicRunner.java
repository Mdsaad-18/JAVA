public class YouTubeMusicRunner{

		public static void main(String args[]){

		YouTubeMusic.user();
		YouTubeMusic.premium(500,400);
		YouTubeMusic.download("Rap song",true);
		String languages[]={"Kannada","Hindi","English","Telugu"};
		YouTubeMusic.value(languages,45);
	}

}