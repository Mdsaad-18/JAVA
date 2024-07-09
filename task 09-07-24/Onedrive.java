public class Onedrive{

public static String storage(){
return "One Drive Details";
}
public static String storage(String name){
return "Name is:"+name;
}
public static String storage(int storage,String name){
	return "Storage is"+storage+" Name is:"+name;
}
public static String storage(String email,int storage,String name){

	
	return "Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;
}
public static String storage(long phone,String email,int storage,String name){
	return "Enter the number:"+phone+" Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;
}
public static String storage(int files,long phone,String email,int storage,String name){
	return "Number of files are:"+files+"Enter the number:"+phone+" Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;
}
public static String storage(int date,int files,long phone,String email,int storage,String name){
	return "File Upload date is:"+date+" Number of files are:"+files+" Enter the number:"+phone+" Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;
}
public static String storage(float size,int date,int files,long phone,String email,int storage,String name){
	return "File Size is:"+size+" File Upload date is:"+date+"  Number of files are:"+files+" Enter the number:"+phone+" Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;

}
public static String storage(String day,float size,int date,int files,long phone,String email,int storage,String name){
   return " File Upload day is:"+day+" File Size is:"+size+" File Upload date is:"+date+"  Number of files are:"+files+" Enter the number:"+phone+" Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;
	
}
public static String storage(float time,String day,float size,int date,int files,long phone,String email,int storage,String name){
	return " File upload time:"+time+" File Upload day is:"+day+" File Size is:"+size+" File Upload date is:"+date+"  Number of files are:"+files+" Enter the number:"+phone+" Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;
}
public static String storage(String filetype,float time,String day,float size,int date,int files,long phone,String email,int storage,String name){
	return "File type is:"+filetype+" File upload time:"+time+" File Upload day is:"+day+" File Size is:"+size+" File Upload date is:"+date+"  Number of files are:"+files+" Enter the number:"+phone+" Enter Email id :"+email+"Storage is:"+storage+" Name is:"+name;

}
}