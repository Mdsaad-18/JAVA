public class kitchen{
	
	public static void checkKitchen(){
		boolean iskitchenClean = true;
		if(iskitchenClean){
			System.out.println(" your kitchen is looking beautiful");
		}else{
			System.out.println("Your kitchen is so dirty");
		}
	}
	
	public static void chiefName(String chiefname){
		boolean ischiefPresent =false;
		if(ischiefPresent){
			System.out.println("The Chief name is: "+chiefname);
		}else{
			System.out.println("no one is present");
		}
	}

	public static boolean kithenItems(){
		int items= 45;
		if(items>=30){
			System.out.println("Rich kitchen");
		}
		return true;
	}
	
	public static int dishesName(String[] dishes){
		boolean isDishesPresent = true;
	    System.out.println("dishes are");
		for(int i= 0 ; i<dishes.length ; i++){
			System.out.println("-" +dishes[i]);			
		}
		if(isDishesPresent){
			System.out.println("Taste is good");
		}
		return 1;
	}


}