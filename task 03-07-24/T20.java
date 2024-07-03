public class T20 {

    // Method 1
    public static void checkPlayerScores() {
        int player1Score = 45;
        int player2Score = 78;
        int player3Score = 23;
        int player4Score = 67;
        int player5Score = 89;

        if (player1Score > 0) {
            System.out.println("Player 1 scored " + player1Score + " runs.");
        }

        if (player2Score > 50) {
            System.out.println("Player 2 scored more than 50 runs.");
        }

        if (player3Score < 30) {
            System.out.println("Player 3 scored less than 30 runs.");
        }

        if (player4Score >= 50) {
            System.out.println("Player 4 scored half-century.");
        }

        if (player5Score > 80) {
            System.out.println("Player 5 scored more than 80 runs.");
        }
    }

    // Method 2
    public static void checkPlayerWickets() {
        int player1Wickets = 2;
        int player2Wickets = 4;
        int player3Wickets = 0;
        int player4Wickets = 1;
        int player5Wickets = 3;

        if (player1Wickets > 0) {
            System.out.println("Player 1 took " + player1Wickets + " wickets.");
        }

        if (player2Wickets >= 4) {
            System.out.println("Player 2 took 4 or more wickets.");
        }

        if (player3Wickets == 0) {
            System.out.println("Player 3 took no wickets.");
        }

        if (player4Wickets == 1) {
            System.out.println("Player 4 took one wicket.");
        }

        if (player5Wickets > 2) {
            System.out.println("Player 5 took more than 2 wickets.");
        }
    }

    // Method 3
    public static void checkTeamStatus() {
        int totalRuns = 320;
        int totalWickets = 8;
        double runRate = 8.5;
        String gameResult = "win";
        int extras = 15;

        if (totalRuns > 300) {
            System.out.println("The team scored more than 300 runs.");
        }

        if (totalWickets < 10) {
            System.out.println("The team lost fewer than 10 wickets.");
        }

        if (runRate > 8.0) {
            System.out.println("The team's run rate is higher than 8.0.");
        }

        if (gameResult.equals("win")) {
            System.out.println("The team won the match.");
        }

        if (extras > 10) {
            System.out.println("The team gave away more than 10 extras.");
        }
    }

    
}