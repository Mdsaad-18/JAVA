public class Chess {

    // Method 1
    public static void checkPieceAvailability() {
        boolean kingAvailable = true;
        boolean queenAvailable = true;
        boolean rookAvailable = false;
        boolean bishopAvailable = true;
        boolean knightAvailable = false;

        if (kingAvailable) {
            System.out.println("The king is available.");
        }

        if (queenAvailable) {
            System.out.println("The queen is available.");
        }

        if (rookAvailable) {
            System.out.println("The rook is available.");
        }

        if (bishopAvailable) {
            System.out.println("The bishop is available.");
        }

        if (knightAvailable) {
            System.out.println("The knight is available.");
        }
    }
	
	// Method 2
    public static void checkMoveLegality() {
        boolean move1Legal = true;
        boolean move2Legal = false;
        boolean move3Legal = true;
        boolean move4Legal = false;
        boolean move5Legal = true;

        if (move1Legal) {
            System.out.println("Move 1 is legal.");
        }

        if (move2Legal) {
            System.out.println("Move 2 is legal.");
        }

        if (move3Legal) {
            System.out.println("Move 3 is legal.");
        }

        if (move4Legal) {
            System.out.println("Move 4 is legal.");
        }

        if (move5Legal) {
            System.out.println("Move 5 is legal.");
        }
    }

    // Method 3
    public static void checkBoardStatus() {
        boolean kingInCheck = false;
        boolean queenThreatened = true;
        boolean rookUnderAttack = false;
        boolean bishopFree = true;
        boolean knightTrapped = true;

        if (kingInCheck) {
            System.out.println("The king is in check.");
        }

        if (queenThreatened) {
            System.out.println("The queen is threatened.");
        }

        if (rookUnderAttack) {
            System.out.println("The rook is under attack.");
        }

        if (bishopFree) {
            System.out.println("The bishop is free.");
        }

        if (knightTrapped) {
            System.out.println("The knight is trapped.");
        }
    }
}