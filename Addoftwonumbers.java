import java.util.Scanner;
public class Addoftwonumbers{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur first number");
		int num1 = sc.nextInt();
		
		System.out.println("enter ur second number");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("the sum of" +num1 +"and" +num2+ "is" + sum);
		
	}
}