import java.util.Scanner;

public class MethodPass 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.print("Pick a number: ");
		n = keyboard.nextInt();
		
		di(n);

	}
	
	public static void di(int n)
	{
		
		if (n % 3 == 0 )
		{
			System.out.print("I like that number!");
		}
		else
		{
			System.out.print("That number is gross...");
		}
	}

		
	
}
