public class Windows{

public static void software(){
System.out.println("Windows details are shown below:");
}
public static void software(String name){
System.out.println("Software name was:"+name);

} 
public static void software(int version,String name){
System.out.println("Version was:"+version+" Name is:"+name);
}
public static void software(int storage,int version,String name){

System.out.println("Storage is:"+storage+" Version was:"+version+" Name is:"+name);
}
public static void software(String app,int storage,int version,String name){
System.out.println("Software app is:"+app+" Storage is:"+storage+" Version was:"+version+" Name is:"+name);

}
public static String software(String instalyear,String app,int storage,int version,String name){
System.out.println(" Software installed year was:"+instalyear+" Software app is:"+app+" Storage is:"+storage+" Version was:"+version+" Name is:"+name );
return app;
}
public static int software(String lastupdate,String instalyear,String app,int storage,int version,String name){
System.out.println(" Last windows updated on:"+lastupdate+" Software installed year was:"+instalyear+" Software app is:"+app+" Storage is:"+storage+" Version was:"+version+" Name is:"+name );
return 6;
}
public static short software(int newversion,String lastupdate,String instalyear,String app,int storage,int version,String name){
System.out.println("New version of windows are:"+newversion+" Last windows updated on:"+lastupdate+" Software installed year was:"+instalyear+" Software app is:"+app+" Storage is:"+storage+" Version was:"+version+" Name is:"+name );
return 7;
}
public static String software(int core,int newversion,String lastupdate,String instalyear,String app,int storage,int version,String name){
System.out.println("Windows core is:"+core+" New version of windows are:"+newversion+" Last windows updated on:"+lastupdate+" Software installed year was:"+instalyear+" Software app is:"+app+" Storage is:"+storage+" Version was:"+version+" Name is:"+name );
return lastupdate;
}
public static void software(String gen,int core,int newversion,String lastupdate,String instalyear,String app,int storage,int version,String name){
System.out.println("Generation is:"+gen+" Windows core is:"+core+" New version of windows are:"+newversion+" Last windows updated on:"+lastupdate+" Software installed year was:"+instalyear+" Software app is:"+app+" Storage is:"+storage+" Version was:"+version+" Name is:"+name );
}
public static void software(int price,String gen,int core,int newversion,String lastupdate,String instalyear,String app,int storage,int version,String name ){
System.out.println("Price is:"+price+"Generation is:"+gen+" Windows core is:"+core+" New version of windows are:"+newversion+" Last windows updated on:"+lastupdate+" Software installed year was:"+instalyear+" Software app is:"+app+" Storage is:"+storage+" Version was:"+version+" Name is:"+name);
}
}