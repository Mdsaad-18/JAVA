public class University {

    static String name;
    static int numberOfStudents;
    static String location;
    static int establishmentYear;
    static double campusArea; // in acres
    static String president;
    static String type;
    static int numberOfFaculties;
    static boolean isPublic;
    static double annualBudget; // in millions

    public static void setName() {
        name = "Tech University";
        System.out.println("Name: " + name);
    }

    public static void setNumberOfStudents() {
        numberOfStudents = 20000;
        System.out.println("Number of Students: " + numberOfStudents);
    }

    public static void setLocation() {
        location = "Silicon Valley";
        System.out.println("Location: " + location);
    }

    public static void setEstablishmentYear() {
        establishmentYear = 1950;
        System.out.println("Establishment Year: " + establishmentYear);
    }

    public static void setCampusArea() {
        campusArea = 1500.5;
        System.out.println("Campus Area: " + campusArea + " acres");
    }

    public static void setPresident() {
        president = "Dr. Alice Johnson";
        System.out.println("President: " + president);
    }

    public static void setType() {
        type = "Research";
        System.out.println("Type: " + type);
    }

    public static void setNumberOfFaculties() {
        numberOfFaculties = 150;
        System.out.println("Number of Faculties: " + numberOfFaculties);
    }

    public static void setIsPublic() {
        isPublic = true;
        System.out.println("Is Public: " + isPublic);
    }

    public static void setAnnualBudget() {
        annualBudget = 500.5;
        System.out.println("Annual Budget: $" + annualBudget + " million");
    }

    public static void main(String[] args) {
        University.setName();
        University.setNumberOfStudents();
        University.setLocation();
        University.setEstablishmentYear();
        University.setCampusArea();
        University.setPresident();
        University.setType();
        University.setNumberOfFaculties();
        University.setIsPublic();
        University.setAnnualBudget();
    }
}
