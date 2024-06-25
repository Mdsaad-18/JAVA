public class ArrayDisplay {

    // Declare arrays of different types
    String[] stringArray = {"Hello", "World", "Java"};
    int[] intArray = {1, 2, 3, 4, 5};
    long[] longArray = {100000L, 200000L, 300000L};
    char[] charArray = {'A', 'B', 'C', 'D'};

    // Method to display the values of the arrays using for loops
    public void displayArrays() {
        System.out.println("String Array:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        System.out.println("Integer Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        System.out.println("Long Array:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();

        System.out.println("Character Array:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an instance of the class and call the display method
        ArrayDisplay arrayDisplay = new ArrayDisplay();
        arrayDisplay.displayArrays();
    }
}
