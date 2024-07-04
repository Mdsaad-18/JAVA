public class Spices {

    public static void SpiceID() {
        int spiceID = 556677889;
        boolean isAvailable = true;
        if (isAvailable) {
            System.out.println("The spice is available");
        } else {
            System.out.println("The spice is not available");
        }
    }

    public static void ToChef(String chefName) {
        boolean isChefSatisfied = true;
        if (isChefSatisfied) {
            System.out.println("The chef is satisfied with the spice");
        } else {
            System.out.println("The chef is not satisfied with the spice");
        }
    }

    public static void ToDish() {
        String dishName = "Pasta";
        boolean isDishComplete = true;

        if (isDishComplete) {
            System.out.println("The dish is complete with the spice");
        } else {
            System.out.println("The dish is incomplete without the spice");
        }
    }

    public static void SpiceDetails(String[] details) {
        int numberOfDetails = details.length;
        boolean areDetailsSufficient = numberOfDetails >= 3;

        for (String detail : details) {
            System.out.println("Detail: " + detail);
        }

        if (areDetailsSufficient) {
            System.out.println("The spice has sufficient details");
        } else {
            System.out.println("The spice does not have sufficient details");
        }
    }
}
