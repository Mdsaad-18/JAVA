public class Student{
	String name;
	char grade;
	public Student(){
    System.out.println("the student details are :");
		
	}
   public Student(String name,	char grade){
	   
	   this.name=name;
	   this.grade=grade; 
   }
  public void displayInfo(){
	System.out.println("the student name is "+ this.name);
	System.out.println("the student grade is "+ this.grade);
  
	
  
	  
  }   


}