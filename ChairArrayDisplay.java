public class ChairArrayDisplay {

    // Declare arrays of different types related to "chair"
    String[] stringArray = {"Seat", "Leg", "Backrest", "Armrest"};
    int[] intArray = {4, 1, 1, 2}; // Number of each part
    long[] longArray = {100000L, 200000L, 300000L, 400000L}; // Some long values, e.g., serial numbers
    char[] charArray = {'C', 'H', 'A', 'I', 'R'}; // Characters spelling "CHAIR"

    // Method to display the values of the arrays using for loops
    public void displayArrays() {
        System.out.println("String Array (Chair Parts):");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        System.out.println("Integer Array (Number of Parts):");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        System.out.println("Long Array (Serial Numbers):");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();

        System.out.println("Character Array (Spelling 'CHAIR'):");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an instance of the class and call the display method
        ChairArrayDisplay chairArrayDisplay = new ChairArrayDisplay();
        chairArrayDisplay.displayArrays();
    }
}
