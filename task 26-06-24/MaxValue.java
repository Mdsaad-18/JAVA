//9. developer need to display the maximum range of each datatype 

   public class MaxValue {
    public static void main(String args[]){
        // Primitive data types
        int a = Integer.MAX_VALUE;
        long d = Long.MAX_VALUE;
        short e = Short.MAX_VALUE;
        byte f = Byte.MAX_VALUE;
        double h = Double.MAX_VALUE;

        // Print the maximum values
        System.out.println("Maximum value of int: " + Integer.MAX_VALUE);
        // String doesn't have a maximum value in the same sense as primitive types
        System.out.println("Strings don't have a maximum value in the same sense as primitive types.");
        System.out.println("Maximum value of long: " + Long.MAX_VALUE);
        System.out.println("Maximum value of char: " + (int) Character.MAX_VALUE);
        System.out.println("Maximum value of short: " + Short.MAX_VALUE);
        System.out.println("Maximum value of byte: " + Byte.MAX_VALUE);
        // Boolean doesn't have a maximum value
        System.out.println("Booleans don't have a maximum value in the same sense as primitive types.");
        System.out.println("Maximum value of double: " + Double.MAX_VALUE);
    }
}
