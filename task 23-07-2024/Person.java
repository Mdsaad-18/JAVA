public class Person{
 String firstname;
 String lastname;
 public Person(){
	 
 System.out.println("No argument Constructor is: ");
 }
 
 public Person(String firstname){
	 this.firstname=firstname;
	  System.out.println("firstname is :"+firstname); 
 }
 
 public Person(String firstname,String lastname){
		 this.firstname=firstname;
	     this.lastname=lastname;
	  System.out.println("firstname is :"+firstname); 
	  System.out.println("lastname is :"+lastname); 
	  System.out.println("the fullname is:  " + firstname +" "+ lastname); 
	  
	  
		 

	 
	 
 }
 
}
 
 