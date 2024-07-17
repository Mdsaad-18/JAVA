public class Book {
    String[] title;
    String[] author;
    int[] pages;
    double[] price;

    public Book() {
        title = new String[]{"1984", "Brave New World", "Fahrenheit 451", "The Road"};
        author = new String[]{"George Orwell", "Aldous Huxley", "Ray Bradbury", "Cormac McCarthy"};
        pages = new int[]{328, 311, 256, 287};
        price = new double[]{9.99, 8.99, 7.99, 10.99};

        for (int i = 0; i < title.length; i++) {
            System.out.println(" - " + title[i]);
            System.out.println(" - " + author[i]);
            System.out.println(" - " + pages[i]);
            System.out.println(" - " + price[i]);
        }
    }
}

