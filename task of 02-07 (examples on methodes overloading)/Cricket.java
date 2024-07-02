public class Cricket {

    public static void calculateRunRate(String playerName, int totalScore) {
        double runRate = totalScore / 50.0;
        System.out.println("Run Rate of " + playerName + ": " + runRate);
    }

    public static void displayMatchResult(String result) {
        System.out.println("Match Result: " + result);
    }

    public static void displayPlayers(String[] players) {
        System.out.println("List of Players:");
        for (String player : players) {
            System.out.println("- " + player);
        }
    }

    public static void displayPlayerDetails(String name, int age, double height, double weight, String education, int matchesPlayed, int totalScore) {
        System.out.println("Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Education: " + education);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Total Score: " + totalScore);
    }
}
