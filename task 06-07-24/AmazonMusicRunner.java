public class AmazonMusicRunner{

		public static void main(String args[]){

		AmazonMusic.user();
		AmazonMusic.premium(500,400);
		AmazonMusic.download("Rap song",true);
		String languages[]={"Kannada","Hindi","English","Telugu"};
		AmazonMusic.value(languages,45);
	}

}