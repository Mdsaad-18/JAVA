/*Assignment:
Create a class Bank
-> achieve Encapsulation
-> Write a method to accept the bank account number, check if bank account
contains 10 digits, then display the Account holder name and bank name
-> write a method to accept the AadharCard number, check if AadharCard number contains extactly 10 digit or not
-> declare a properties for the class bank,
-> write a method to accept the bank_balance, bankname, accountholder name
1. if bank_balance <500, display please maintain bank balance
2. if bank_balance>500 and <10,000, add the 10% interest and display the total account balance to the user
3. if bank_balance>10,000 and <50000 add 20% interest and display the total account balance
-> if user wants to withdraw 1000rs from his account,
1. if user bankbalance is less then that then display the message
"Account balance is low, you can't withdraw amount"
2. if user bankbalance is more then that then display the remaining balance
*/


public class Bank {
    private String accountHolderName;
    private String bankName;
    private String accountNumber;
    private String aadharCardNumber;
    private double bankBalance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean setAccountNumber(String accountNumber) {
        if (accountNumber.length() == 10) {
            this.accountNumber = accountNumber;
            return true;
        } else {
            System.out.println("Account number must be 10 digits.");
            return false;
        }
    }

    public String getAadharCardNumber() {
        return aadharCardNumber;
    }

    public boolean setAadharCardNumber(String aadharCardNumber) {
        if (aadharCardNumber.length() == 12) {
            this.aadharCardNumber = aadharCardNumber;
            return true;
        } else {
            System.out.println("AadharCard number must be 12 digits.");
            return false;
        }
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void displayAccountDetails() {
        if (accountNumber != null && accountNumber.length() == 10) {
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Bank Name: " + bankName);
        } else {
            System.out.println("Invalid account number.");
        }
    }

    public void processBankBalance() {
        if (bankBalance < 500) {
            System.out.println("Please maintain a minimum bank balance of 500.");
        } else if (bankBalance >= 500 && bankBalance < 10000) {
            bankBalance += bankBalance * 0.10;
            System.out.println("Total Account Balance after 10% interest: " + bankBalance);
        } else if (bankBalance >= 10000 && bankBalance < 50000) {
            bankBalance += bankBalance * 0.20;
            System.out.println("Total Account Balance after 20% interest: " + bankBalance);
        } else {
            System.out.println("Total Account Balance: " + bankBalance);
        }
    }

    public void withdrawAmount(double amount) {
        if (bankBalance < amount) {
            System.out.println("Account balance is low, you can't withdraw amount.");
        } else {
            bankBalance -= amount;
            System.out.println("Remaining Balance: " + bankBalance);
        }
    }
}
