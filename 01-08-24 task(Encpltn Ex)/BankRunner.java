public class BankRunner {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        
        myBank.setAccountHolderName("Saad Maniyar");
        myBank.setBankName("SBI India");
        
        if (myBank.setAccountNumber("0011223344")) {
            myBank.displayAccountDetails();
        }
        
        myBank.setAadharCardNumber("507190536350");
        
        myBank.setBankBalance(105000);
        myBank.processBankBalance();
        
        myBank.withdrawAmount(10000);
    }
}
