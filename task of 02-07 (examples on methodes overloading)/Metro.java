public class Metro {

    public static void displayTicketPrice(String from, String to) {
        if (from.equals("Bhanashankari") && to.equals("BTM")) {
            System.out.println("Ticket price is 25rs");
        } else {
            System.out.println("Ticket price is 50rs");
        }
    }

    public static void checkCardBalance(double cardBalance, double ticketPrice) {
        double remainingBalance = cardBalance - ticketPrice;
        System.out.println("Card balance after deducting ticket price: " + remainingBalance + "rs");
    }
}
