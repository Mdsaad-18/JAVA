public class Phonepe {

    public static void TranscationID() {
        int transactionID = 123654789;
        boolean isID = true;
        if (isID) {
            System.out.println("The payment is successful");
        } else {
            System.out.println("The transaction has failed! Try again later");
        }
    }

    public static void ToMyFriend(String Shahid) {
        boolean isShahidReceived = true;
        if (isShahidReceived) {
            System.out.println("The transaction is complete");
        } else {
            System.out.println("The transaction is incomplete");
        }
    }

    public static void ToMobileNumber() {
        int mobileNum = 63640;
        boolean isMobileNumValid = true;

        if (isMobileNumValid) {
            System.out.println("The number is correct");
        } else {
            System.out.println("The number is incorrect");
        }
    }

    public static void Details(String[] names) {
        int numberOfPersons = 10;
        boolean isNumberOfPersonsValid = true;

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        if (isNumberOfPersonsValid) {
            System.out.println("The number of persons is 10");
        } else {
            System.out.println("The number of persons is less than 10");
        }
    }
}
