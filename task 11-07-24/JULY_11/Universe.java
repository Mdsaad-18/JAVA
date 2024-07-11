public class Universe {

    static String name;
    static int age; 
    static int numberOfGalaxies;
    static double diameter;
    static String dominantElement;
    static String theoryOfOrigin;
    static boolean expanding;
    static double temperature;
    static long numberOfStars;
    static long numberOfPlanets;

    public static void setName() {
        name = "Observable Universe";
        System.out.println("Name: " + name);
    }

    public static void setAge() {
        age = 13;
        System.out.println("Age: " + age + " billion years");
    }

    public static void setNumberOfGalaxies() {
        numberOfGalaxies = 2000000000;
        System.out.println("Number of Galaxies: " + numberOfGalaxies);
    }

    public static void setDiameter() {
        diameter = 93;
        System.out.println("Diameter: " + diameter + " billion light-years");
    }

    public static void setDominantElement() {
        dominantElement = "Hydrogen";
        System.out.println("Dominant Element: " + dominantElement);
    }

    public static void setTheoryOfOrigin() {
        theoryOfOrigin = "Big Bang Theory";
        System.out.println("Theory of Origin: " + theoryOfOrigin);
    }

    public static void setExpanding() {
        expanding = true;
        System.out.println("Expanding: " + expanding);
    }

    public static void setTemperature() {
        temperature = 2.7;
        System.out.println("Temperature: " + temperature + " Kelvin");
    }

    public static void setNumberOfStars() {
        numberOfStars = 100000000000000L;
        System.out.println("Number of Stars: " + numberOfStars);
    }

    public static void setNumberOfPlanets() {
        numberOfPlanets = 1000000000000L;
        System.out.println("Number of Planets: " + numberOfPlanets);
    }

    public static void main(String[] args) {
        Universe.setName();
        Universe.setAge();
        Universe.setNumberOfGalaxies();
        Universe.setDiameter();
        Universe.setDominantElement();
        Universe.setTheoryOfOrigin();
        Universe.setExpanding();
        Universe.setTemperature();
        Universe.setNumberOfStars();
        Universe.setNumberOfPlanets();
    }
}
