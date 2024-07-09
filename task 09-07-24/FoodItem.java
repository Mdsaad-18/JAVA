public class FoodItem{
public static String itemDetails(){
return "ABOUT FOOD ITEM";
}
public static String itemDetails(String name){
return "FOOD ITEM NAME :"+name;
}
public static String itemDetails(String name, String category){
return "FOOD ITEM NAME :"+name+" CATOGORY : "+category;
}
public static String itemDetails(String name, String category, double price){
return "FOOD ITEM NAME :"+name+" CATOGORY : "+category+" PRICE : "+price+"Rs";
}
public static String itemDetails(String name, String category, double price, int quantity){
return "FOOD ITEM NAME :"+name+" CATOGORY : "+category+" PRICE : "+price+"Rs"+ " NET QUANTITY :"+quantity+"g";
}
public static String itemDetails(String name, String category, double price, int quantity, String expDate){
return "FOOD ITEM NAME :"+name+" CATOGORY : "+category+" PRICE : "+price+"Rs"+ " NET QUANTITY :"+quantity+"g"+" EXPIRY DATE :"+expDate;
}
public static String itemDetails(String name, String category, double price, int quantity, String expDate, int calories){
return "FOOD ITEM NAME :"+name+" CATOGORY : "+category+" PRICE : "+price+"Rs"+ " NET QUANTITY :"+quantity+"g"+" EXPIRY DATE :"+expDate+" CALORIES : "+calories;
}
public static String itemDetails(String name, String category, double price, int quantity, String expDate, int calories, boolean isOrganic){
return "FOOD ITEM NAME :"+name+" CATOGORY : "+category+" PRICE : "+price+"Rs"+ " NET QUANTITY :"+quantity+"g"+" EXPIRY DATE :"+expDate+" CALORIES : "+calories+
" IS ORGANIC : "+isOrganic;

}
}
