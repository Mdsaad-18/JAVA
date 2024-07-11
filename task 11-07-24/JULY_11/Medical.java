public class Medical {

    // Static variables declaration
    public static String hospitalName = "City Hospital";
    public static int totalBeds = 300;
    public static int doctors = 50;
    public static float rating = 4.5f;

    public static void getDetails() {
        String specialty = "Cardiology";
        System.out.println("Specialty: " + specialty);

        long annualPatients = 20000L;
        System.out.println("Annual Patients: " + annualPatients);

        String chiefDoctor = "Dr. Smith";
        System.out.println("Chief Doctor: " + chiefDoctor);

        String location = "Downtown";
        System.out.println("Location: " + location);
    }

    public static void setFoundationYear(int year, long revenue) {
        int foundationYear = year;
        System.out.println("Foundation Year: " + foundationYear);

        long annualRevenue = revenue;
        System.out.println("Annual Revenue:" + annualRevenue);
    }

    public static void main(String[] args) {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Total Beds: " + totalBeds);
        System.out.println("Doctors: " + doctors);
        System.out.println("Rating: " + rating + " stars");

        Medical.getDetails();
        Medical.setFoundationYear(1995, 5000000L);
    }
}
