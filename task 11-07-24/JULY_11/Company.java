public class Company {

    public static void operateCompany() {
        System.out.println("Company operations are ongoing.");
        Company.setStrategy();
        Company.manageEmployees();
        Company.investCapital();
    }
    
    public static void setStrategy() {
        System.out.println("Define company strategy");
    }
    
    public static void manageEmployees() {
        System.out.println("Manage employee performance");
    }
    
    public static void investCapital() {
        System.out.println("Invest in growth opportunities");
    }
    
    public static void main(String[] args) {
        Company.operateCompany();
    }
}
