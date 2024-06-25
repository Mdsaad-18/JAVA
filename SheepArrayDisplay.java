public class SheepArrayDisplay {

    // Declare arrays of different types related to "sheep"
    String[] stringArray = {"Wool", "Legs", "Ears", "Tail"};
    int[] intArray = {1, 4, 2, 1}; // Number of each part
    long[] longArray = {123456789L, 987654321L, 123123123L, 987987987L}; // Some long values, e.g., tag numbers
    char[] charArray = {'S', 'H', 'E', 'E', 'P'}; // Characters spelling "SHEEP"

    // Method to display the values of the arrays using for loops
    public void displayArrays() {
        System.out.println("String Array (Sheep Parts):");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        System.out.println("Integer Array (Number of Parts):");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        System.out.println("Long Array (Tag Numbers):");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();

        System.out.println("Character Array (Spelling 'SHEEP'):");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an instance of the class and call the display method
        SheepArrayDisplay sheepArrayDisplay = new SheepArrayDisplay();
        sheepArrayDisplay.displayArrays();
    }
}
