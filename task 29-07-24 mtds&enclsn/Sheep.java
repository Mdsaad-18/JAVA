/*3.Create class with 4 properties(properties should taken has array type)
and make it private and assign values and display it.*/

public class Sheep {
    private String[] sheepNames;
    private int[] sheepAges;
    private double[] sheepWeights;
    private String[] sheepColors;

    // Setter and getter methods for sheepNames
    public void setSheepNames(String[] sheepNames) {
        this.sheepNames = sheepNames;
    }

    public String[] getSheepNames() {
        return this.sheepNames;
    }

    // Setter and getter methods for sheepAges
    public void setSheepAges(int[] sheepAges) {
        this.sheepAges = sheepAges;
    }

    public int[] getSheepAges() {
        return this.sheepAges;
    }

    // Setter and getter methods for sheepWeights
    public void setSheepWeights(double[] sheepWeights) {
        this.sheepWeights = sheepWeights;
    }

    public double[] getSheepWeights() {
        return this.sheepWeights;
    }

    // Setter and getter methods for sheepColors
    public void setSheepColors(String[] sheepColors) {
        this.sheepColors = sheepColors;
    }

    public String[] getSheepColors() {
        return this.sheepColors;
    }

    public static void main(String[] args) {
        Sheep sheepDetails = new Sheep();

        String[] names = {"Sultaan", "Dori", "Maccha"};
        int[] ages = {2, 3, 4};
        double[] weights = {45.5, 50.0, 55.5};
        String[] colors = {"Hanichukki", "Black", "Red"};

        sheepDetails.setSheepNames(names);
        sheepDetails.setSheepAges(ages);
        sheepDetails.setSheepWeights(weights);
        sheepDetails.setSheepColors(colors);

        System.out.println("Sheep Names: ");
        for (String name : sheepDetails.getSheepNames()) {
            System.out.println(name);
        }

        System.out.println("\nSheep Ages: ");
        for (int age : sheepDetails.getSheepAges()) {
            System.out.println(age);
        }

        System.out.println("\nSheep Weights: ");
        for (double weight : sheepDetails.getSheepWeights()) {
            System.out.println(weight);
        }

        System.out.println("\nSheep Colors: ");
        for (String color : sheepDetails.getSheepColors()) {
            System.out.println(color);
        }
    }
}
