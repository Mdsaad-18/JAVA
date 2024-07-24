//5. Write a program to store the shop names and the developer needs to Perform the Create and Read operation

  public class Shop{
  String[] shopItems= new String[4];
  int index=0;
  
  public int getshopItemList(){
	  return shopItems.length;
  }
  public String insertItemOfShop(String itemName){
	  if(this.index<this.getshopItemList()){
		  shopItems[index]=itemName;
		  index++;  
	  }else{
		  System.out.println("the Shop Item are OverLoaded");
	  }
	  return "the item is added succesfully";
  }
  public void readItemsInshop(){
	  for(int i=0; i<shopItems.length; i++){
	  System.out.println("__"+shopItems[i]);
  }}
  
  }