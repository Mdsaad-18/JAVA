public class Animal{
 String name;
 int age;
 
 public Animal(){
System.out.println("No argument Constructor is: ");

 }
 public Animal(String name){
	 this.name=name;
 System.out.println("name is :"+name); 
 }
  public Animal(String name, int age){

	 this.name=name;
	 this.age=age;
	 System.out.println("name is :"+name);
	 System.out.println("age is :"+age);
 }
}

	 
 