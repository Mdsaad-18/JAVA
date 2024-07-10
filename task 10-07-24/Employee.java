public class Employee {
    // Declare 10 static variables
    static String name;
    static float salary;
    static int age;
    static String address;
    static String email;
    static long phone;
    static String location;
    static String companyName;
    static int familyMember;
    static String role;

    // Method to set and print the name
    public static void setName(String newName) {
        name = "saad";
        System.out.println("Name: " + name);
    }

    // Method to set and print the salary
    public static void setSalary(float newSalary) {
        salary = 100000f;
        System.out.println("Salary: " + salary);
    }

    // Method to set and print the age
    public static void setAge(int newAge) {
        age = 22;
        System.out.println("Age: " + age);
    }

    // Method to set and print the address
    public static void setAddress(String newAddress) {
        address = "gadag";
        System.out.println("Address: " + address);
    }

    // Method to set and print the email
    public static void setEmail(String newEmail) {
        email = "saadmaniyar@gmail";
        System.out.println("Email: " + email);
    }

    // Method to set and print the phone number
    public static void setPhone(long newPhone) {
        phone = 6364083827L;
        System.out.println("Phone: " + phone);
    }

    // Method to set and print the location
    public static void setLocation(String newLocation) {
        location = "BTM BENGLURU";
        System.out.println("Location: " + location);
    }

    // Method to set and print the company name
    public static void setCompanyName(String newCompanyName) {
        companyName = "INFOSYS";
        System.out.println("Company Name: " + companyName);
    }

    // Method to set and print the number of family members
    public static void setFamilyMember(int newFamilyMember) {
        familyMember = 10;
        System.out.println("Family Members: " + familyMember);
    }

    // Method to set and print the role
    public static void setRole(String newRole) {
        role = "SOFTWARE DEVELOPER";
        System.out.println("Role: " + role);
    }

    public static void main(String[] args) {
        setName("Saad");
        setSalary(100000f);
        setAge(22);
        setAddress("Gadag");
        setEmail("saadmaniyar@gmail.com");
        setPhone(6364083827L);
        setLocation("BTM Bangalore");
        setCompanyName("Infosys");
        setFamilyMember(9);
        setRole("Software Developer");
    }
}
