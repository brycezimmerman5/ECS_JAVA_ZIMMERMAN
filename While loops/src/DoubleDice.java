import java.util.Random;
import java.util.Scanner;
public class DoubleDice
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int dice = 1 + r.nextInt(6), dice2 = 1 + r.nextInt(6), total;
		
		while ( dice != dice2 )
		{
		dice = 1 + r.nextInt(6);
		System.out.println("Roll #1: " +dice);
		dice2 = 1 + r.nextInt(6);
		System.out.println("Roll #2: " +dice2);
		System.out.println("The total is " +(dice+dice2));
		}
	}
}
