public class Songs{
	
	public static void checkSongsList(){
		String[] songAvailables ={"kahani_Suno","DJ","PushPa","Kavaliya"};
		boolean isSongValide = true;
		if(isSongValide){
			System.out.println("Songs Availables are");
			for(int i= 0 ; i<songAvailables.length ; i++){
			System.out.println("-" +songAvailables[i]);			
		    }
		}else{
			System.out.println("Subscribe Your Spotify");
		}
	}
	
	public static void songsPlaying(String songName){
		boolean isSongAvailable =true;
		if(isSongAvailable){
			System.out.println("Your song is: "+songName+" is playing");
		}else{
			System.out.println("This song is not available in Spotify");
		}
	}

	public static boolean songDownload(){
		String songName ="ABCD";
		boolean isDownload =true;
		if(isDownload){
			System.out.println("You downloaded song is "+songName);
		}else{
			System.out.println("You are not download anything");
		}
		return true;
	}
	
	public static int listOfSongsPlatforms(String[] PlatformsName){
		System.out.println("You are song platforms are");
		for(int i= 0 ; i<PlatformsName.length ; i++){
			System.out.println("-" +PlatformsName[i]);			
		}
		if(PlatformsName.length>=10){
			System.out.println("Your memory is full & delete songs from list");
		}else{
			System.out.println("make your favourite platform list");
		}
		
		return 1;
	}


}