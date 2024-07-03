public class Table {

    // Method 1
    public static void checkTableStatus() {
        boolean isClean = true;
        boolean isOccupied = false;
        boolean hasReservation = true;
        boolean isBroken = false;
        boolean hasMenu = true;

        if (isClean) {
            System.out.println("The table is clean.");
        }

        if (isOccupied) {
            System.out.println("The table is occupied.");
        }

        if (hasReservation) {
            System.out.println("The table has a reservation.");
        }

        if (isBroken) {
            System.out.println("The table is broken.");
        }

        if (hasMenu) {
            System.out.println("The table has a menu.");
        }
    }

    // Method 2
    public static void checkTableItems() {
        boolean hasNapkins = true;
        boolean hasCutlery = true;
        boolean hasGlass = false;
        boolean hasSalt = true;
        boolean hasPepper = false;

        if (hasNapkins) {
            System.out.println("The table has napkins.");
        }

        if (hasCutlery) {
            System.out.println("The table has cutlery.");
        }

        if (hasGlass) {
            System.out.println("The table has a glass.");
        }

        if (hasSalt) {
            System.out.println("The table has salt.");
        }

        if (hasPepper) {
            System.out.println("The table has pepper.");
        }
    }

    // Method 3
    public static void checkTablePosition() {
        boolean nearWindow = true;
        boolean nearDoor = false;
        boolean nearKitchen = true;
        boolean inCorner = false;
        boolean inCenter = true;

        if (nearWindow) {
            System.out.println("The table is near the window.");
        }

        if (nearDoor) {
            System.out.println("The table is near the door.");
        }

        if (nearKitchen) {
            System.out.println("The table is near the kitchen.");
        }

        if (inCorner) {
            System.out.println("The table is in the corner.");
        }

        if (inCenter) {
            System.out.println("The table is in the center.");
        }
    }

    
}