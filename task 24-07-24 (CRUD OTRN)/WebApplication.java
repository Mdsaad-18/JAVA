//declare 1 class in that declare 5 static variables and 5 instance variables initialize the variables using constructor
 public class WebApplication{
	 // instance variables
	String webPageName;
     String url;
     double rating;
	 char grade;
	 String ownerName;
	 
	 // static variables
	 static int revenue;
	 static int users;
	 static boolean isUseFull;
	 static boolean isGood;
	 static boolean isFamous;
	 
	 public WebApplication(){
		this.webPageName="codewithHarry";
        this.url="http://codewithharry.com";
        this.grade='A';
		this.ownerName="Harry";
		
		this.revenue=200000;
		users=100000;
		isUseFull=true;
		isGood=true;
		isFamous=true;

	 }
	 
 
 }