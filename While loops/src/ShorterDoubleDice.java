import java.util.Random;
import java.util.Scanner;
public class ShorterDoubleDice
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int dice = 1 + r.nextInt(6), dice2 = 1 + r.nextInt(6), total;
		
		do
		{
		dice = 1 + r.nextInt(6);
		System.out.println("Roll #1: " +dice);
		dice2 = 1 + r.nextInt(6);
		System.out.println("Roll #2: " +dice2);
		System.out.println("The total is " +(dice+dice2));
		} while (dice != dice2);
	}
}
