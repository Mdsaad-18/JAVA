/*4. Create a class with 3 properties and declare a 4 ways of
methods and achieve method overloading and chaining of instance methods
*/

public class Cricket {
    private String playerName;
    private int playerAge;
    private double battingAverage;

    // Constructor
    public Cricket(String playerName, int playerAge, double battingAverage) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.battingAverage = battingAverage;
    }

    public void printDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Age: " + playerAge);
        System.out.println("Batting Average: " + battingAverage);
    }

    public Cricket setPlayerName(String playerName) {
        this.playerName = playerName;
        return this;
    }

    public Cricket setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
        return this;
    }

    public Cricket setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
        return this;
    }

    public void updateDetails(String playerName) {
        this.playerName = playerName;
    }

    public void updateDetails(String playerName, int playerAge) {
        this.playerName = playerName;
        this.playerAge = playerAge;
    }

    public void updateDetails(String playerName, int playerAge, double battingAverage) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.battingAverage = battingAverage;
    }

    public void updateDetails(int playerAge, double battingAverage) {
        this.playerAge = playerAge;
        this.battingAverage = battingAverage;
    }

    public static void main(String[] args) {
        Cricket player = new Cricket("Virat Kohli", 34, 50.5);

        player.setPlayerName("Sachin Tendulkar")
              .setPlayerAge(47)
              .setBattingAverage(54.2);

        player.printDetails();

        player.updateDetails("Rohit Sharma");
        player.printDetails();

        player.updateDetails("MS Dhoni", 39);
        player.printDetails();

        player.updateDetails("AB de Villiers", 37, 53.4);
        player.printDetails();

        player.updateDetails(36, 52.3);
        player.printDetails();
    }
}
