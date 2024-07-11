public class Office {

    // Static variables declaration
    public static String officeName = "XworkZ";
    public static int employees = 20;
    public static int departments = 10;
    public static float area = 15000.5f; // in square feet

    public static void getDetails() {
        String location = "BTM Layout";
        System.out.println("Location: " + location);

        long annualRevenue = 50000L; 
        System.out.println("Annual Revenue: " + annualRevenue);

        String ceo = "Akshara";
        System.out.println("CEO: " + ceo);

        String headQuarter = "Ring Road Mico Layout";
        System.out.println("HeadQuarter: " + headQuarter);
    }

    public static void setEstablishmentYear(int year, long netWorth) {
        int establishmentYear = year;
        System.out.println("Establishment Year: " + establishmentYear);

        long totalNetWorth = netWorth; 
        System.out.println("Total Net Worth:" + totalNetWorth);
    }

    public static void main(String[] args) {
        System.out.println("Office Name: " + officeName);
        System.out.println("Employees: " + employees);
        System.out.println("Departments: " + departments);
        System.out.println("Area: " + area + " square feet");

        Office.getDetails();
        Office.setEstablishmentYear(2005, 10000000L);
    }
}
