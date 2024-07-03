public class DrinksRunner {
    public static void main(String[] args) {
        Drinks drinks = new Drinks();

        drinks.showDrinkDetails("Coke", 15, true);
        drinks.showDrinkVolume("Pepsi", 600, true);
        drinks.showDrinkIngredients("Sprite", true, false);
        drinks.showDrinkOrigin("Fanta", "USA", true);
    }
}
