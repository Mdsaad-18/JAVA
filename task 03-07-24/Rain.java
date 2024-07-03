public class Rain {

   
    public  static void rainIntensity(String location, int intensity, boolean isHeavy) {
        if (location.equals("City")) {
            System.out.println("Location: City");
        }
        if (intensity > 50) {
            System.out.println("Intensity: Heavy");
        }
        if (isHeavy) {
            System.out.println("It's raining heavily");
        }
    }

    public static void rainDuration(String season, int duration, boolean isLong) {
        if (season.equals("Monsoon")) {
            System.out.println("Season: Monsoon");
        }
        if (duration > 120) {
            System.out.println("Duration: Long");
        }
        if (isLong) {
            System.out.println("The rain duration is long");
        }
    }

    
    public static void rainLocation(String type, boolean isUrban, boolean isRural) {
        if (type.equals("Urban")) {
            System.out.println("Type: Urban");
        }
        if (isUrban) {
            System.out.println("It's raining in an urban area");
        }
        if (isRural) {
            System.out.println("It's raining in a rural area");
        }
    }

    
    public static void rainImpact(String area, boolean isFlooded, boolean isTrafficJam) {
        if (area.equals("Low-lying")) {
            System.out.println("Area: Low-lying");
        }
        if (isFlooded) {
            System.out.println("The area is flooded");
        }
        if (isTrafficJam) {
            System.out.println("There's a traffic jam due to rain");
        }
    }
}
