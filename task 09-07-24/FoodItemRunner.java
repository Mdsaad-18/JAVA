public class FoodItemRunner{
public static void main(String[] args){
System.out.println(FoodItem.itemDetails());
System.out.println(FoodItem.itemDetails("LION DATES"));
System.out.println(FoodItem.itemDetails("LION DATES","DRY FRUITS"));
System.out.println(FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00));
System.out.println(FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500));
System.out.println(FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500,"16/10/2024"));
System.out.println(FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500,"16/10/2024",1410));
System.out.println(FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500,"16/10/2024",1410,true));


}
}
