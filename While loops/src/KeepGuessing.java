import java.util.Random;
import java.util.Scanner;
public class KeepGuessing
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int n = 1 + r.nextInt(10), g = 11;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it");
		while ( g!= n )
		{
			System.out.println("Your Guess");
			g = keyboard.nextInt();
			
			if (g == n)
			{
				System.out.println("That's right! Your're a good guesser.");
			}
			else
			{
				System.out.println("Try Again.");
			}
		}
	}
}

