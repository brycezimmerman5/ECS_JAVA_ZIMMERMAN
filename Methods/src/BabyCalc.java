import java.util.Scanner;

public class BabyCalc
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Give me a math procedure: ");
		String num1 = keyboard.next();
		String opp = keyboard.next();
		String num2 = keyboard.next();
		System.out.println();
		
		System.out.print(num1);
		System.out.print(opp);
		System.out.print(num2);
		System.out.println();
		
		System.out.println("You want to (" + opp + "): " + num1 + " and " + num2 + ".");
	}
 
}
