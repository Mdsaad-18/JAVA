public class PayRole {

    // Method with no return type
    public static void employee() {
        System.out.println("Employee name: John Doe");
    }

    public static void employee(String name) {
        System.out.println("Employee name: " + name);
    }

    public static void employee(String name, int id) {
        System.out.println("Employee name: " + name + ", ID: " + id);
    }

    public static void employee(String name, int id, double salary) {
        System.out.println("Employee name: " + name + ", ID: " + id + ", Salary: $" + salary);
    }

    public static void employee(String name, int id, double salary, String department) {
        System.out.println("Employee name: " + name + ", ID: " + id + ", Salary: $" + salary + ", Department: " + department);
    }

    // Method with return type
    public static double employee(String name, int id, double salary, String department, int experience) {
        System.out.println("Employee name: " + name + ", ID: " + id + ", Salary: $" + salary + ", Department: " + department + ", Experience: " + experience + " years");
        return salary;
    }

    public static void main(String[] args) {
        PayRole.employee();
        PayRole.employee("Alice Smith");
        PayRole.employee("Bob Johnson", 101);
        PayRole.employee("Eve Brown", 202, 5000.0);
        PayRole.employee("Charlie Green", 303, 7000.0, "Finance");
        PayRole.employee("Grace Davis", 404, 9000.0, "HR", 8);
    }
}
