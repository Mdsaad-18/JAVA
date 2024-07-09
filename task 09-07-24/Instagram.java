public class Instagram{
public static void instaDetails(){
System.out.println("HERE IS THE DETAILS OF INSTAGRAM ACCOUNT Roronova_zoro.....");
}
/*public static void instaDetails(){
System.out.println();
}*/
public static void instaDetails(int followers){
System.out.println("FOLLOWERS : "+followers);
}
public static void instaDetails(int followers, int following){
System.out.println("FOLLOWERS : "+followers+" /FOLLOWING : "+following);
}
public static void instaDetails(int followers, int following, int mutual_Friends){
System.out.println("FOLLOWERS : "+followers+" /FOLLOWING : "+following+" /MUTUAL FRIENDS : "+mutual_Friends);
}
public static void instaDetails(int followers, int following, int mutual_Friends, boolean isStatusUploaded){
	System.out.println("FOLLOWERS : "+followers+" /FOLLOWING : "+following+" /MUTUAL FRIENDS : "+mutual_Friends+" /STATUS UPLOADED : "+isStatusUploaded);

}
public static int instaDetails(int followers, int following, int mutual_Friends, boolean isStatusUploaded,
double size){
System.out.println("FOLLOWERS : "+followers+" /FOLLOWING : "+following+" /MUTUAL FRIENDS : "+mutual_Friends+" /STATUS UPLOADED : "+isStatusUploaded);
System.out.println("HERE IS THE DETAILS OF INSTAGRAM");
System.out.println("TOTAL ("+size+")MB");
return 1;
}
public static int instaDetails(int followers, int following, int mutual_Friends, boolean isStatusUploaded,
double size, int numberOfusers){
System.out.println("FOLLOWERS : "+followers+" /FOLLOWING : "+following+" /MUTUAL FRIENDS : "+mutual_Friends+" /STATUS UPLOADED : "+isStatusUploaded);
System.out.println("HERE IS THE DETAILS OF INSTAGRAM");
System.out.println("TOTAL ("+size+")MB"+" /TOTAL USER :"+numberOfusers+"M");
return 2;
}
public static int instaDetails(int followers, int following, int mutual_Friends, boolean isStatusUploaded,
double size, int numberOfusers, float rating){
System.out.println("FOLLOWERS : "+followers+" /FOLLOWING : "+following+" /MUTUAL FRIENDS : "+mutual_Friends+" /STATUS UPLOADED : "+isStatusUploaded);
System.out.println("HERE IS THE DETAILS OF INSTAGRAM");
System.out.println("TOTAL ("+size+")MB"+" /TOTAL USER :"+numberOfusers+"M"+" /WITH RATING :"+rating);
return 3;
}
public static int instaDetails(int followers, int following, int mutual_Friends, boolean isStatusUploaded,
double size, int numberOfusers, float rating, boolean isInPlaystore){
System.out.println("FOLLOWERS : "+followers+" /FOLLOWING : "+following+" /MUTUAL FRIENDS : "+mutual_Friends+" /STATUS UPLOADED : "+isStatusUploaded);
System.out.println("HERE IS THE DETAILS OF INSTAGRAM");
System.out.println("TOTAL ("+size+")MB"+" /TOTAL USER :"+numberOfusers+"M"+" /WITH RATING :"+rating+" /IS IT AVAILABLE IN PLAYSTORE :"+isInPlaystore);
return 4;
}
}
