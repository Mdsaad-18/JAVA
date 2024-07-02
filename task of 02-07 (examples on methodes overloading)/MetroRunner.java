public class MetroRunner {
    public static void main(String[] args) {
        Metro.displayTicketPrice("Bhanashankari", "BTM");
        Metro.displayTicketPrice("Bhanashankari", "Jayanagar");

        double cardBalance = 200.0;
        double ticketPrice = 50.0;
        Metro.checkCardBalance(cardBalance, ticketPrice);

        Dealers.displayDealerInfo("Metro Trains", "Bangalore", 9876543210L);
    }
}
