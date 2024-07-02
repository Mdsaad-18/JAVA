public class Biriyani {

    public static void displayIngredients(String... ingredients) {
        System.out.println("Biriyani Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }

    public static void displayReview(int review) {
        System.out.print("Review: " + review + " - ");
        if (review == 10) {
            System.out.println("Wow");
        } else if (review > 5) {
            System.out.println("Good");
        } else {
            System.out.println("Worst");
        }
    }

    public static void calculateTotalPrice(int quantity, double pricePerPlate) {
        double totalPrice = quantity * pricePerPlate;
        System.out.println("Total Price for " + quantity + " plates of Biriyani: " + totalPrice + " Rs");
    }
}
