public class Water {
   
    public void waterQuality(String type, int pH, boolean isDrinkable) {
        if (type.equals("Mineral")) {
            System.out.println("Type: Mineral Water");
        }
        if (pH > 7) {
            System.out.println("pH: Alkaline");
        }
        if (isDrinkable) {
            System.out.println("The water is drinkable");
        }
    }

   
    public void waterSource(String source, int volume, boolean isFresh) {
        if (source.equals("Spring")) {
            System.out.println("Source: Spring Water");
        }
        if (volume > 1000) {
            System.out.println("Volume: More than 1000 liters");
        }
        if (isFresh) {
            System.out.println("The water is fresh");
        }
    }

    
    public void waterTemperature(String name, int temperature, boolean isCold) {
        if (name.equals("Tap")) {
            System.out.println("Type: Tap Water");
        }
        if (temperature < 10) {
            System.out.println("Temperature: Cold");
        }
        if (isCold) {
            System.out.println("The water is cold");
        }
    }

    
    public void waterPurity(String brand, int purityLevel, boolean isFiltered) {
        if (brand.equals("Aquafina")) {
            System.out.println("Brand: Aquafina");
        }
        if (purityLevel > 90) {
            System.out.println("Purity Level: High");
        }
        if (isFiltered) {
            System.out.println("The water is filtered");
        }
    }
}
