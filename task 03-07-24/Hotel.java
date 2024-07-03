public class Hotel {
    
    // Method 1
    public static void checkAvailability() {
        boolean room1 = true;
        boolean room2= false;
        boolean room3 = true;
        boolean room4 = false;
        boolean room5 = true;

        if (room1) {
            System.out.println("Room 1 is available.");
        }

        if (room2) {
            System.out.println("Room 2 is available.");
        }

        if (room3) {
            System.out.println("Room 3 is available.");
        }

        if (room4) {
            System.out.println("Room 4 is available.");
        }

        if (room5) {
            System.out.println("Room 5 is available.");
        }
    }

    // Method 2: Checking amenities
    public static void checkFacilities() {
        boolean poolAvailable= true;
        boolean gym = true;
        boolean spa = false;
        boolean restaurant = true;
        boolean bar = false;

        if (poolAvailable) {
            System.out.println("The pool is open.");
        }

        if (gym) {
            System.out.println("The gym is open.");
        }

        if (spa) {
            System.out.println("The spa is open.");
        }

        if (restaurant) {
            System.out.println("The restaurant is open.");
        }

        if (bar) {
            System.out.println("The bar is open.");
        }
    }

    // Method 3
    public static void checkStaffAvailability() {
        boolean receptionistAvailable = true;
        boolean cleanerAvailable = true;
        boolean chefAvailable = false;
        boolean managerAvailable = true;
        boolean conciergeAvailable = true;

        if (receptionistAvailable) {
            System.out.println("The receptionist is available.");
        }

        if (cleanerAvailable) {
            System.out.println("The cleaner is available.");
        }

        if (chefAvailable) {
            System.out.println("The chef is available.");
        }

        if (managerAvailable) {
            System.out.println("The manager is available.");
        }

        if (conciergeAvailable) {
            System.out.println("The concierge is available.");
        }
    }

    
}