/* 7. Write a program to store the Alphabets and the developer needs to perform the Create and Read Operation.*/

public class Alphabets{
	
	char[] alphabets= new char[26];
	int index=0;
	public int getAlphabetList(){
		return alphabets.length;
	}
	
	public String insertAlphabets(char alph){
		if(this.index<this.getAlphabetList()){
			alphabets[index]=alph;
			index++;
		}else{
			System.out.println("The Shop Items are OverLoaded");
		}
		return "The item price is added successfully";
	}
	
	public void readAlphabets(){
		for(int i=0; i<alphabets.length; i++){
			System.out.println("-"+alphabets[i]);
		}
	}

}