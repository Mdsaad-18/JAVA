//Charger ->declare 10 static variables and display it
public class Charger {
    // Declare 10 static variables
    static int var1 = 1;
    static int var2 = 2;
    static int var3 = 3;
    static int var4 = 4;
    static int var5 = 5;
    static int var6 = 6;
    static int var7 = 7;
    static int var8 = 8;
    static int var9 = 9;
    static int var10 = 10;

    // Method to display the variables
    public static void displayVariables() {
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
        System.out.println("var9: " + var9);
        System.out.println("var10: " + var10);
    }

    public static void main(String[] args) {
        // Display the static variables
        displayVariables();
    }
}
