public class Human{
// 10 instace variable
 String name;
 String address;
 int age;
 float height;
 float wieght;
 float salary;
 String nationality;
 String fromState;
 boolean married;
 String qualification;


// no argument consturtor
 public Human(){
	 System.out.println("this is a no argument consturtor is defined");
 
 }
 // consturtor with all argument
 public Human(String name,
 String address,
 int age,
 float height,
 float wieght,
 float salary,
 String nationality,
 String fromState,
 boolean married,
 String qualification 
 ){
	 this.name=name;
	 this.age=age;
	 this.height=height;
	 this.wieght=wieght;
	 this.salary=salary;
	 this.nationality=nationality;
	 this.fromState=fromState;
	 this.married=married;
	 this.qualification=qualification;
	 this.salary=salary;	 
 }
 	// 4 instance method using 4 ways
 public void humanEating(){
	 System.out.println("Human is eating");
 }
 
 public void humanRunning(String name){
	 System.out.println("human Name:"+name);

 }
 public boolean humanReading(){
		System.out.println("Human is Reading");
		return true;
	}
	
	public boolean humanListening(String name,int salary){
		System.out.println("Human Name:"+name);
		System.out.println("the salary is:"+salary);
		return true;
	}
	
	// main method
	public static void main(String args[]){
		Human saad= new Human();
		Human saad1= new Human("Saad","Gadag",22,6.0f,50.5f,45000f,"Indian","karnataka",true,"BE CSE");
		
		Human saad3 = new Human();
		saad3.humanEating();
		saad3.humanRunning("saad");
		saad3.humanReading();
		saad3.humanListening("saad",50000);
		
	}
		
	}
 
 