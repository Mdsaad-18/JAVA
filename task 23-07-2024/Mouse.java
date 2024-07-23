public class Mouse {

    int mouseQuantity;
    String[] mouseModels;
    String brand;
    double price;
    boolean isWireless;

    public void displayModels() {
        String[] mouseModels = {"Model X", "Model Y", "Model Z", "Model A", "Model B"};
        for (int i = 0; i < mouseModels.length; i++) {
            System.out.println("- " + mouseModels[i]);
        }
    }

    public int getMouseQuantity() {
        this.mouseQuantity = 5;
        System.out.println("Total Mouse Models available: " + mouseQuantity);
        return mouseQuantity;
    }

    public void displayMousePrice(String brand, double price) {
        this.brand = brand;
        this.price = price;
        if (brand.equals("TechBrand") && price > 1000) {
            System.out.println("High Rated Brand: " + brand);
            System.out.println("Total price of the mouse is: " + price);
        }
    }

    public boolean displayMouseDetails(boolean isWireless) {
        this.mouseQuantity = 5;
        this.brand = "TechBrand";
        this.price = 1200;
        this.isWireless = isWireless;
        if (isWireless) {
            System.out.println("Total mouse models available: " + mouseQuantity);
            System.out.println("High Rated Brand: " + brand);
            System.out.println("Total price of the mouse is: " + price);
        }
        return true;
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.displayModels();
        mouse.getMouseQuantity();
        mouse.displayMousePrice("TechBrand", 1500);
        mouse.displayMouseDetails(true);
    }
}