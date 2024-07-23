public class Books {
    String title;
    double price;
    String author;

    public Books(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public Books(String title, double price) {
        this(title, price, "Unknown Author");
    }

    public Books(String title) {
        this(title, 0.0, "Unknown Author");
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Books book1 = new Books("Java Programming", 39.99, "John Doe");
        Books book2 = new Books("Python Programming", 29.99);
        Books book3 = new Books("C++ Programming");

        book1.printDetails();
        System.out.println();
        book2.printDetails();
        System.out.println();
        book3.printDetails();
    }
}
