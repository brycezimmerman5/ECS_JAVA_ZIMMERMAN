
import java.util.Scanner;

public class BetterCollatz 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int n, steps = 0, bignum = 0;
		System.out.println("Let's create a COLLAT SEQUENCE!");
		System.out.println("Rules:");
		System.out.println("If the number is even divide it by 2.");
		System.out.println("If the number is odd multiply by 3 and add 1");
		System.out.println("Repeat this desicion until you reach 1.");
		
		System.out.println("Starting number (integar greater than 1): ");
		n = keyboard.nextInt();
		System.out.print("[");
		do
		{
			if (n > bignum)
			{
				bignum = n;
			}
			if(n % 2 == 0)
			{ 
				n=(n/2); System.out.print(n);
				steps ++;
			}
			else
			{
				n=(n*3+1); System.out.print(n);
				steps++;
			}
			System.out.print("-");
		}while (n > 1);
		System.out.print("]");
		System.out.println("Terminated after " +steps+ " steps.");
		System.out.println("The largest value was" +bignum );
	}

}
