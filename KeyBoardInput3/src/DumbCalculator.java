import java.util.Scanner;
public class DumbCalculator
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int one, two, three;
		double avg;
		
		System.out.println("Let's find the average of a few numbers...");
		
		System.out.println("What is the first number? ");
		one = keyboard.nextInt();
		System.out.println("What is the second number");
		two = keyboard.nextInt();		
		System.out.println("What is the third number");
		three = keyboard.nextInt();
		System.out.println("The average of the three numbers is " +(one + two + three)/3);
		
	}
}
