public class Linkedin {
  
  public static void profileDetails() {
    System.out.println("Displaying Profile Details:");
    Linkedin.educationDetails();
    Linkedin.personalDetails();
    Linkedin.skills();
    Linkedin.percentageOfDegree();
  }
  
  public static void educationDetails() {
    String degree = "BE-CSE";
    System.out.println("Education Details: " + degree);
  }
  
  public static void personalDetails() {
    String name = "Saad";
    long number = 6364083827L;
    System.out.println("Personal Details: Name - " + name + ", Number - " + number);
  }
  
  public static void skills() {
    String skills = "Java";
    System.out.println("Skills: " + skills);
  }
  
  public static void percentageOfDegree() {
    double percentage = 85.00;
    System.out.println("Percentage of Degree: " + percentage + "%");
  }
  
  public static void main(String[] args) {
    Linkedin.profileDetails();
  }
}
