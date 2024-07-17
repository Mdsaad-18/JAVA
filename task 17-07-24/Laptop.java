public class Laptop {
    String[] brand;
    int[] price;
    float[] screenSize;
    int[] ram;

    public Laptop() {
        String brand1[] = {"Dell", "HP", "Apple", "Lenovo"};
        brand = brand1;
        int price1[] = {800, 1000, 1500, 1200}; // in dollars
        price = price1;
        float screenSize1[] = {15.6f, 14.0f, 13.3f, 15.0f}; // in inches
        screenSize = screenSize1;
        int ram1[] = {8, 16, 16, 8}; // in GB
        ram = ram1;

        for (int i = 0; i < brand.length; i++) {
            System.out.println(" - " + brand[i]);
            System.out.println(" - " + price[i]);
            System.out.println(" - " + screenSize[i]);
            System.out.println(" - " + ram[i]);
        }
    }
}

