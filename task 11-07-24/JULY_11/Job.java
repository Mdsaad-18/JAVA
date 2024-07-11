public class Job {

    // Method with no return type
    public static void position() {
        System.out.println("Position: Software Developer");
    }

    public static void position(String title) {
        System.out.println("Position: " + title);
    }

    public static void position(String title, int level) {
        System.out.println("Position: " + title + ", Level: " + level);
    }

    public static void position(String title, int level, double salary) {
        System.out.println("Position: " + title + ", Level: " + level + ", Salary: " + salary);
    }

    public static void position(String title, int level, double salary, String department) {
        System.out.println("Position: " + title + ", Level: " + level + ", Salary: " + salary + ", Department: " + department);
    }

    // Method with return type
    public static double position(String title, int level, double salary, String department, boolean isFullTime) {
        System.out.println("Position: " + title + ", Level: " + level + ", Salary: " + salary + ", Department: " + department + ", Full-time: " + isFullTime);
        return salary;
    }

    public static void main(String[] args) {
        Job.position();
        Job.position("Software Traine Engineer");
        Job.position("Java Developer", 2);
        Job.position("Product Manager", 3, 100000.0);
        Job.position("HR Specialist", 1, 60000.0, "Human Resources");
        Job.position("Marketing Director", 4, 120000.0, "Marketing", true);
    }
}
