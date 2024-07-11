public class Galaxy {

    static String name;
    static int numberOfStars;
    static String type;
    static int age; // in billions of years
    static double diameter; // in light-years
    static String nearestGalaxy;
    static String discoveredBy;
    static int numberOfPlanets;
    static boolean hasBlackHole;
    static double distanceFromEarth; // in million light-years

    public static void setName() {
        name = "Andromeda";
        System.out.println("Name: " + name);
    }

    public static void setNumberOfStars() {
        numberOfStars = 1000000000;
        System.out.println("Number of Stars: " + numberOfStars);
    }

    public static void setType() {
        type = "Spiral";
        System.out.println("Type: " + type);
    }

    public static void setAge() {
        age = 10;
        System.out.println("Age: " + age + " billion years");
    }

    public static void setDiameter() {
        diameter = 220000;
        System.out.println("Diameter: " + diameter + " light-years");
    }

    public static void setNearestGalaxy() {
        nearestGalaxy = "Milky Way";
        System.out.println("Nearest Galaxy: " + nearestGalaxy);
    }

    public static void setDiscoveredBy() {
        discoveredBy = "Edwin Hubble";
        System.out.println("Discovered By: " + discoveredBy);
    }

    public static void setNumberOfPlanets() {
        numberOfPlanets = 100000000;
        System.out.println("Number of Planets: " + numberOfPlanets);
    }

    public static void setHasBlackHole() {
        hasBlackHole = true;
        System.out.println("Has Black Hole: " + hasBlackHole);
    }

    public static void setDistanceFromEarth() {
        distanceFromEarth = 2.537;
        System.out.println("Distance from Earth: " + distanceFromEarth + " million light-years");
    }

    public static void main(String[] args) {
        Galaxy.setName();
        Galaxy.setNumberOfStars();
        Galaxy.setType();
        Galaxy.setAge();
        Galaxy.setDiameter();
        Galaxy.setNearestGalaxy();
        Galaxy.setDiscoveredBy();
        Galaxy.setNumberOfPlanets();
        Galaxy.setHasBlackHole();
        Galaxy.setDistanceFromEarth();
    }
}
