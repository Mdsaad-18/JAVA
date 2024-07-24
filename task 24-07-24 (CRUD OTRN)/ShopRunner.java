public class ShopRunner{
  public static void main(String args[]){
	  Shop shop = new Shop();
	  int length=shop.getshopItemList();
	  System.out.println("length  :"+ length);
	  
	  shop.insertItemOfShop("rice");
	  shop.insertItemOfShop("termeric");
	  shop.insertItemOfShop("nirma");
	  shop.insertItemOfShop("ginger paste");
	  
	  
	  shop.insertItemOfShop("masoor daal");

  }
}