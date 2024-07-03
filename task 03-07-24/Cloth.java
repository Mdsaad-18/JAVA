public class Cloth {

   
    public static void clothType(String type, boolean isFormal, boolean isCasual) {
        if (type.equals("Shirt")) {
            System.out.println("Type: Shirt");
        }
        if (isFormal) {
            System.out.println("It's a formal cloth");
        }
        if (isCasual) {
            System.out.println("It's a casual cloth");
        }
    }

    
    public static void clothColor(String color, boolean isBright, boolean isDark) {
        if (color.equals("Blue")) {
            System.out.println("Color: Blue");
        }
        if (isBright) {
            System.out.println("It's a bright color");
        }
        if (isDark) {
            System.out.println("It's a dark color");
        }
    }

   
    public static void clothSize(String size, boolean isSmall, boolean isLarge) {
        if (size.equals("Medium")) {
            System.out.println("Size: Medium");
        }
        if (isSmall) {
            System.out.println("It's a small size");
        }
        if (isLarge) {
            System.out.println("It's a large size");
        }
    }

    
    public static void clothMaterial(String material, boolean isCotton, boolean isSynthetic) {
        if (material.equals("Silk")) {
            System.out.println("Material: Silk");
        }
        if (isCotton) {
            System.out.println("It's made of cotton");
        }
        if (isSynthetic) {
            System.out.println("It's made of synthetic material");
        }
    }
}
