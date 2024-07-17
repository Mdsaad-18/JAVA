public class Bike{
	
	String[] name;
	int[] price ;
	short[] millege;
	float[] cc;
	
	public Bike(){
		String name1[] ={"yamaha", "Mahindra", "Activa", "Hero"};
		name = name1;
		int price1[] = {1000,2000,3000,4000};// thousands
		price =price1;
		short millege1[] ={100,75,65,85};
		millege =millege1;
		float cc1[] ={55f,65f,100f,55f};
		cc =cc1;
		
		
		for(int i=0; i<name.length; i++){
			System.out.println(" - " + name[i]);
			
			System.out.println(" - " + price[i]);
			
			System.out.println(" - " + millege[i]);
			
			System.out.println(" - " + cc[i]); 
		}
	}
}