import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rect1 = new Rectangle();
        System.out.println("Enter width for rectangle 1: ");
        double width1 = scanner.nextDouble();
        System.out.println("Enter height for rectangle 1: ");
        double height1 = scanner.nextDouble();
        rect1.setDimensions(width1, height1);
        System.out.println("Rectangle 1:");
        rect1.displayInfo();

        System.out.println("Enter width for rectangle 2: ");
        double width2 = scanner.nextDouble();
        System.out.println("Enter height for rectangle 2: ");
        double height2 = scanner.nextDouble();
        Rectangle rect2 = new Rectangle(width2, height2);
        System.out.println("Rectangle 2:");
        rect2.displayInfo();

        scanner.close();
    }
}
