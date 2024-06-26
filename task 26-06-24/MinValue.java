//10. developer need to display the minimum range of each datatype

public class MinValue {
    public static void main(String args[]){
        // Primitive data types
        int a = Integer.MIN_VALUE;
        long d = Long.MIN_VALUE;
        short e = Short.MIN_VALUE;
        byte f = Byte.MIN_VALUE;
        double h = Double.MIN_VALUE;

        // Print the maximum values
        System.out.println("MINIMUM value of int: " + Integer.MIN_VALUE);
        // String doesn't have a MINIMUM value in the same sense as primitive types
        System.out.println("Strings don't have a maximum value in the same sense as primitive types.");
        System.out.println("MINIMUM value of long: " + Long.MIN_VALUE);
        System.out.println("MINIMUM value of char: " + (int) Character.MIN_VALUE);
        System.out.println(" MINIMUM value of short: " + Short.MIN_VALUE);
        System.out.println("Minimum value of byte: " + Byte.MIN_VALUE);
        // Boolean doesn't have a minimum value
        System.out.println("Booleans don't have a maximum value in the same sense as primitive types.");
        System.out.println("minimum value of double: " + Double.MIN_VALUE);
    }
}