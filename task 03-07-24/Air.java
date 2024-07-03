public class Air {

    public static void airQuality(String type, int pollutionLevel, boolean isBreathable) {
        if (type.equals("Urban")) {
            System.out.println("Type: Urban Air");
        }
        if (pollutionLevel > 100) {
            System.out.println("Pollution Level: High");
        }
        if (isBreathable) {
            System.out.println("The air is breathable");
        }
    }

    public static void airHumidity(String region, int humidityLevel, boolean isHumid) {
        if (region.equals("Tropical")) {
            System.out.println("Region: Tropical");
        }
        if (humidityLevel > 70) {
            System.out.println("Humidity Level: High");
        }
        if (isHumid) {
            System.out.println("The air is humid");
        }
    }

    public static void airTemperature(String location, int temperature, boolean isHot) {
        if (location.equals("Desert")) {
            System.out.println("Location: Desert");
        }
        if (temperature > 35) {
            System.out.println("Temperature: Hot");
        }
        if (isHot) {
            System.out.println("The air is hot");
        }
    }

    public static void airPressure(String altitude, int pressure, boolean isLowPressure) {
        if (altitude.equals("High")) {
            System.out.println("Altitude: High");
        }
        if (pressure < 1000) {
            System.out.println("Pressure: Low");
        }
        if (isLowPressure) {
            System.out.println("The air pressure is low");
        }
    }
}
