public class Mocktails {

    public static void DrinkID() {
        int drinkID = 112233445;
        boolean isAvailable = true;
        if (isAvailable) {
            System.out.println("The mocktail is available");
        } else {
            System.out.println("The mocktail is not available");
        }
    }

    public static void ToCustomer(String customerName) {
        boolean isCustomerSatisfied = true;
        if (isCustomerSatisfied) {
            System.out.println("The customer is satisfied with the mocktail");
        } else {
            System.out.println("The customer is not satisfied with the mocktail");
        }
    }

    public static void ToTableNumber() {
        int tableNum = 15;
        boolean isTableAvailable = true;

        if (isTableAvailable) {
            System.out.println("The table number is available");
        } else {
            System.out.println("The table number is not available");
        }
    }

    public static void Ingredients(String[] ingredients) {
        int numberOfIngredients = ingredients.length;
        boolean areIngredientsSufficient = numberOfIngredients >= 5;

        for (String ingredient : ingredients) {
            System.out.println("Ingredient: " + ingredient);
        }

        if (areIngredientsSufficient) {
            System.out.println("The mocktail has sufficient ingredients");
        } else {
            System.out.println("The mocktail does not have sufficient ingredients");
        }
    }
}
