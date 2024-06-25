public class BagArrayDisplay {

    // Declare arrays of different types related to "bag"
    String[] stringArray = {"Zipper", "Pocket", "Strap", "Compartment"};
    int[] intArray = {1, 3, 2, 1}; // Number of each part
    long[] longArray = {123456789L, 987654321L, 123123123L, 987987987L}; // Some long values, e.g., serial numbers
    char[] charArray = {'B', 'A', 'G'}; // Characters spelling "BAG"

    // Method to display the values of the arrays using for loops
    public void displayArrays() {
        System.out.println("String Array (Bag Parts):");
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

        System.out.println("Character Array (Spelling 'BAG'):");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an instance of the class and call the display method
        BagArrayDisplay bagArrayDisplay = new BagArrayDisplay();
        bagArrayDisplay.displayArrays();
    }
}
