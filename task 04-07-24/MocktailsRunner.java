public class MocktailsRunner {

    public static void main(String[] args) {
        Mocktails.DrinkID();
        Mocktails.ToCustomer("Alice");
        Mocktails.ToTableNumber();
        String[] ingredients = {"Mint", "Lemon", "Sugar", "Soda", "Ice"};
        Mocktails.Ingredients(ingredients);
    }
}
