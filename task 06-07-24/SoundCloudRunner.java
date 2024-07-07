public class SoundCloudRunner{

		public static void main(String args[]){

		SoundCloud.user();
		SoundCloud.premium(500,400);
		SoundCloud.download("Rap song",true);
		String languages[]={"Kannada","Hindi","English","Telugu"};
		SoundCloud.value(languages,45);
	}

}