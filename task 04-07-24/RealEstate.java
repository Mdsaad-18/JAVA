public class RealEstate {

    public static void PropertyID() {
        int propertyID = 987654321;
        boolean isAvailable = true;
        if (isAvailable) {
            System.out.println("The property is available for sale");
        } else {
            System.out.println("The property is not available");
        }
    }

    public static void ToBuyer(String buyerName) {
        boolean isBuyerInterested = true;
        if (isBuyerInterested) {
            System.out.println("The buyer is interested");
        } else {
            System.out.println("The buyer is not interested");
        }
    }

    public static void ToLocation() {
        String location = "Downtown";
        boolean isLocationPrime = true;

        if (isLocationPrime) {
            System.out.println("The location is prime");
        } else {
            System.out.println("The location is not prime");
        }
    }

    public static void PropertyDetails(String[] features) {
        int numberOfFeatures = features.length;
        boolean areFeaturesSufficient = numberOfFeatures > 3;

        for (String feature : features) {
            System.out.println("Feature: " + feature);
        }

        if (areFeaturesSufficient) {
            System.out.println("The property has sufficient features");
        } else {
            System.out.println("The property does not have sufficient features");
        }
    }
}
