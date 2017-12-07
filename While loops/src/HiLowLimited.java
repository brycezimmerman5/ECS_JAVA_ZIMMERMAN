import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
{
	public static void main( String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice = 1 + r.nextInt(100), response, tries=0;
		System.out.println("Im thinking of a number between 1-100. You have 7 guesses.");
		while (tries != 7)
		{
			response = keyboard.nextInt();
			if (response<choice)
			{
				System.out.println("Sorry you are too low.");
				tries ++;
			}
			if (response>choice)
			{
				System.out.println("Sorry you are too high.");
				tries ++;
			}
			if (choice == response)
			{
				System.out.println("You guessed it! What are the odds?!?");
			}
			if (tries == 7)
			{
				System.out.println("Sorry, you didn't guess it in 7 tries. You lose. The answer was " +choice);
			}
		}
	}
}



