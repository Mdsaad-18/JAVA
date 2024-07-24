public class ClothBrands{
    String cloths[]= new String[4];
	int index=0;
	
	
	public int getArrayLength(){
		
		return cloths.length;
	}
	
	public void insertArray(String clothName){
		if(this.index<this.getArrayLength()){
			cloths[index]=clothName;
			index++;
		}
		else{
			System.out.println("the array is full");
		}
	}
	
	public void readArray(){
		for(int index=0; index<getArrayLength(); index++){
						System.out.println("the values of arrays are:" +cloths[index] );

		
		}	
	}
	
	public void searchArray(String clothName){
	for(int index=0; index<getArrayLength(); index++){
     if (cloths[index] == clothName){
		 System.out.println("the cloth is found"   + cloths[index]);
	 }
		
	}
	}
}