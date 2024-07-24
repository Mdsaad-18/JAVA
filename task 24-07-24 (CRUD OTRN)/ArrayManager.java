
public class ArrayManager {
        int[] array;

  public ArrayManager(int size) {
        array = new int[size];
    }

             public void insert(int index, int element) {
        if (index < 0 || index >= array.length) {
                  System.out.println("Index out of bounds");
            return;
        }
            array[index] = element;
    }

           public void delete(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Index out of bounds");
                  return;
        }
                for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0; 
    }

             public int search(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; 
    }

              public void display() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    
			  }
}
