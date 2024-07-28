public class EncapsulationRunner{
	public static void main(String args[]){
		
		Encapsulation profile = new Encapsulation();
		
		profile.setName("Md Saad Maniyar");
		System.out.println("Name : "+ profile.getName());
		
		profile.setAge(22);
		System.out.println("Age is : "+profile.getAge());
		
		profile.setQualification("Computer Science");
		System.out.println("Qualification:"+profile.getQualification());
		
		profile.setCgpa(8.5f);
		System.out.println("the CGPA is : "+ profile.getCgpa());
		
		profile.setPercentage(80.0);
		System.out.println("Percentage:"+profile.getPercentage());
		
		profile.setGrade('A');
		System.out.println("Grade:"+profile.getGrade());
		
		profile.setExperience(2);
		System.out.println("Experience:"+profile.getExperience());
		
		profile.setAddress("Gadag Betgeri 58102");
		System.out.println("Address:"+profile.getAddress());
		
		profile.setHobby("Coding");
		System.out.println("Hobby:"+profile.getHobby());
		
       String skills[] = {"java","MySql","JDBC"};
       profile.setSkills(skills);
       for(int i=0; i<skills.length; i++){
	   profile.getSkills();
	   System.out.println("__" + skills[i]);
	   }	   
	}

}