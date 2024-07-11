public class PassPortOffice {

    static String officeName;
    static String location;
    static int establishmentYear;
    static int numberOfStaff;
    static double area; // in square feet
    static String head;
    static int dailyApplications;
    static boolean hasOnlineServices;
    static double annualRevenue; // in millions
    static int processingTime; // in days

    public static void setOfficeName() {
        officeName = "Central Passport Office";
        System.out.println("Office Name: " + officeName);
    }

    public static void setLocation() {
        location = "Downtown";
        System.out.println("Location: " + location);
    }

    public static void setEstablishmentYear() {
        establishmentYear = 1990;
        System.out.println("Establishment Year: " + establishmentYear);
    }

    public static void setNumberOfStaff() {
        numberOfStaff = 150;
        System.out.println("Number of Staff: " + numberOfStaff);
    }

    public static void setArea() {
        area = 20000.5;
        System.out.println("Area: " + area + " square feet");
    }

    public static void setHead() {
        head = "Alice Brown";
        System.out.println("Head: " + head);
    }

    public static void setDailyApplications() {
        dailyApplications = 500;
        System.out.println("Daily Applications: " + dailyApplications);
    }

    public static void setHasOnlineServices() {
        hasOnlineServices = true;
        System.out.println("Has Online Services: " + hasOnlineServices);
    }

    public static void setAnnualRevenue() {
        annualRevenue = 15.2;
        System.out.println("Annual Revenue: $" + annualRevenue + " million");
    }

    public static void setProcessingTime() {
        processingTime = 14;
        System.out.println("Processing Time: " + processingTime + " days");
    }

    public static void main(String[] args) {
        PassPortOffice.setOfficeName();
        PassPortOffice.setLocation();
        PassPortOffice.setEstablishmentYear();
        PassPortOffice.setNumberOfStaff();
        PassPortOffice.setArea();
        PassPortOffice.setHead();
        PassPortOffice.setDailyApplications();
        PassPortOffice.setHasOnlineServices();
        PassPortOffice.setAnnualRevenue();
        PassPortOffice.setProcessingTime();
    }
}
