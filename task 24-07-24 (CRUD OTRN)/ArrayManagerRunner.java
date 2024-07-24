public class ArrayManagerRunner {
    public static void main(String[] args) {
        ArrayManager am = new ArrayManager(10);

             System.out.println("Inserting elements:");
        am.insert(0, 10);
                   am.insert(1, 20);
        am.insert(2, 30);
      am.display(); 

             System.out.println("Deleting element at index 1:");
        am.delete(1);
        am.display(); 

            System.out.println("Searching for element 30:");
             int index = am.search(30);
        if (index != -1) {
            System.out.println("Element 30 found at index: " + index); // Output: Element 30 found at index: 1
        } else {
            System.out.println("Element 30 not found.");
        }

              System.out.println("Searching for element 40:");
             index = am.search(40);
        if (index != -1) {
            System.out.println("Element 40 found at index: " + index);
        } else {
                 System.out.println("Element 40 not found."); 
        }
    }
}
