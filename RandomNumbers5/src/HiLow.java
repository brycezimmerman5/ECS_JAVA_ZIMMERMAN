import java.util.Random;
import java.util.Scanner;
public class HiLow 
{
	public static void main( String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice = 1 + r.nextInt(100), response;
		
		System.out.println("Im thinking of a number between 1-100. Try to guess it.");
		response = keyboard.nextInt();
		if (choice < response)
		{
			System.out.println("Sorry you are too low. I was thinking of " +choice);
		}
		if (choice > response)
		{
			System.out.println("Sorry you are too high. I was thinking of " +choice);
		}
		if (choice == response)
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
	}

}
