public class JioSaavnRunner{

		public static void main(String args[]){

		JioSaavn.user();
		JioSaavn.premium(500,400);
		JioSaavn.download("Rap song",true);
		String languages[]={"Kannada","Hindi","English","Telugu"};
		JioSaavn.value(languages,45);
	}

}