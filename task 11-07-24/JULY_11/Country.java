/* in 5 declare 10 var and assign values to the var
 using the method reference*/
 
 public class Country {

    static String name;
    static int population;
    static String capital;
    static int establishmentYear;
    static double gdp; // in trillions
    static String continent;
    static String president;
    static int area; // in square kilometers
    static boolean isDeveloped;
    static double literacyRate; // in percentage

    public static void setName() {
        name = "Freedonia";
        System.out.println("Name: " + name);
    }

    public static void setPopulation() {
        population = 50000000;
        System.out.println("Population: " + population);
    }

    public static void setCapital() {
        capital = "Libertapolis";
        System.out.println("Capital: " + capital);
    }

    public static void setEstablishmentYear() {
        establishmentYear = 1776;
        System.out.println("Establishment Year: " + establishmentYear);
    }

    public static void setGdp() {
        gdp = 3.5;
        System.out.println("GDP: " + gdp + " trillion USD");
    }

    public static void setContinent() {
        continent = "North America";
        System.out.println("Continent: " + continent);
    }

    public static void setPresident() {
        president = "Jane Smith";
        System.out.println("President: " + president);
    }

    public static void setArea() {
        area = 950000; // in square kilometers
        System.out.println("Area: " + area + " square kilometers");
    }

    public static void setIsDeveloped() {
        isDeveloped = true;
        System.out.println("Is Developed: " + isDeveloped);
    }

    public static void setLiteracyRate() {
        literacyRate = 99.5;
        System.out.println("Literacy Rate: " + literacyRate + "%");
    }

    public static void main(String[] args) {
        Country.setName();
        Country.setPopulation();
        Country.setCapital();
        Country.setEstablishmentYear();
        Country.setGdp();
        Country.setContinent();
        Country.setPresident();
        Country.setArea();
        Country.setIsDeveloped();
        Country.setLiteracyRate();
    }
}
