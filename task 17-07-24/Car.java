public class Car {
    String[] name;
    int[] price;
    int[] speed;
    String[] color;

    public Car() {
        String name1[] = {"Toyota", "Honda", "Ford", "BMW"};
        name = name1;
        int price1[] = {20000, 25000, 30000, 50000}; // in dollars
        price = price1;
        int speed1[] = {120, 130, 140, 150}; // in mph
        speed = speed1;
        String color1[] = {"Red", "Blue", "Black", "White"};
        color = color1;

        for (int i = 0; i < name.length; i++) {
            System.out.println(" - " + name[i]);
            System.out.println(" - " + price[i]);
            System.out.println(" - " + speed[i]);
            System.out.println(" - " + color[i]);
        }
    }
}


