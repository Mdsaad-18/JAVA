public class Employees {
    int id;
    String name;
    String department;

    public Employees() {
        // Default values for attributes
        this(0, "Unknown", "Unknown");
    }

    public Employees(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employees(int id, String name) {
        this(id, name, "Unknown");
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employees emp1 = new Employees(); // Default constructor
        Employees emp2 = new Employees(101, "Alice", "HR");
        Employees emp3 = new Employees(102, "Bob");

        System.out.println("Employee 1:");
        emp1.printDetails();
        System.out.println();
        
        System.out.println("Employee 2:");
        emp2.printDetails();
        System.out.println();
        
        System.out.println("Employee 3:");
        emp3.printDetails();
    }
}
