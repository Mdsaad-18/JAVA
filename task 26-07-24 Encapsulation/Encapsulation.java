/* declare a class with 10 properties and 
declare getters and setters methods for each property */

public class Encapsulation{

	//class of profile
	private String name;
	private int age;
	private String qualification;
	private float cgpa; 
	private double percentage;
	private char grade;
	private String[] skills;
	private int experince;
	private String address;
	private String hobby;
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setQualification(String qualification){
		this.qualification=qualification;
	}
	
	public String getQualification(){
		return this.qualification;
	}
	
	public void setCgpa(float cgpa){
		this.cgpa=cgpa;
	}
	
	public float getCgpa(){
		return this.cgpa;
	}
	
	public void setPercentage(double percentage){
		this.percentage=percentage;
	}
	
	public double getPercentage(){
		return this.percentage;
	}
	
	public void setGrade(char grade){
		this.grade=grade;
	}
	
	public char getGrade(){
		return this.grade;
	}
	
	public void setExperience(int experince){
		this.experince=experince;
	}
	
	public int getExperience(){
		return this.experince;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setHobby(String hobby){
		this.hobby=hobby;
	}
	
	public String getHobby(){
		return this.hobby;
	}
	
	public void setSkills(String[] skills){
		this.skills=skills;
	}
	
	public String[] getSkills(){
		return this.skills;
	}
	
}