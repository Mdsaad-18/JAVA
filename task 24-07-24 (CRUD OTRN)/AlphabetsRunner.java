public class AlphabetsRunner{

	public static void main(String args[]){
		
		Alphabets alpha=new Alphabets();
		int length=alpha.getAlphabetList();
		System.out.println("length:"+length);
		
		alpha.insertAlphabets('A');
		alpha.insertAlphabets('B');
		alpha.insertAlphabets('C');
		alpha.insertAlphabets('D');
		alpha.insertAlphabets('E');
		alpha.insertAlphabets('F');
		alpha.insertAlphabets('G');
		alpha.insertAlphabets('H');
		
		alpha.readAlphabets();
	}

}