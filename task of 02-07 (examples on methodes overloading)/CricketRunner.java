public class CricketRunner {
    public static void main(String[] args) {
	
	
        Cricket.calculateRunRate("Virat Kohli", 120);
        Cricket.displayMatchResult("India won by 50 runs");
        
        String[] players = {"Rohit Sharma", "Shikhar Dhawan", "Hardik Pandya", "Jasprit Bumrah", "Ravindra Jadeja", "MS Dhoni", "Yuzvendra Chahal", "KL Rahul", "Rishabh Pant", "Bhuvneshwar Kumar", "Kuldeep Yadav"};
        Cricket.displayPlayers(players);
        
        Cricket.displayPlayerDetails("Rohit Sharma", 34, 173.0, 72.5, "MBA", 220, 8900);
    }
}
