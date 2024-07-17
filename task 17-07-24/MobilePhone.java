public class MobilePhone {
    String[] brand;
    int[] price;
    int[] storage;
    float[] screenSize;

    public MobilePhone() {
        String brand1[] = {"Samsung", "Apple", "OnePlus", "Nokia"};
        brand = brand1;
        int price1[] = {700, 1000, 600, 400}; // in dollars
        price = price1;
        int storage1[] = {128, 256, 128, 64}; // in GB
        storage = storage1;
        float screenSize1[] = {6.1f, 5.8f, 6.5f, 6.0f}; // in inches
        screenSize = screenSize1;

        for (int i = 0; i < brand.length; i++) {
            System.out.println(" - " + brand[i]);
            System.out.println(" - " + price[i]);
            System.out.println(" - " + storage[i]);
            System.out.println(" - " + screenSize[i]);
        }
    }
}

