 public class Employee {
    String name;
    double salary;

    public Employee() {
        this.name = "Unknown";
        this.salary = 0;
    }

    public void displayAttributes() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}
