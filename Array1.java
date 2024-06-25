//Assignment:
//1. create a 20 classes, in each class declare a array of type String,int,long,char and display it.

 public class Array1 {
	   public static void main(String args[]) {
		     String names[] = {"saad","taufiq","varun","raam","ritesh"};
			 int age[]   = {21,22,23,24,24,25};
			long phonenumber[] = {636408,990210,636400,991144,147852};
		     char address[] = {'M','S','K','H','M'};
			 
			 for (int a=0; a<names.length; a++){
				 System.out.println("the names of the students  "  + names[a]);
				  System.out.println("the age of the students  "  + age[a]);
				   System.out.println("the phonenumber of the students  " + phonenumber[a]);
				    System.out.println("the address of the students  "  + address[a]);
					System.out.println("\n");
			 }
			
			 
	 }
}