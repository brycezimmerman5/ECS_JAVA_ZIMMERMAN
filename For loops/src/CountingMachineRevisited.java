import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main( String[] args )
	{
		int choice, start, count;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Count to: " );
		choice = keyboard.nextInt();
		System.out.print( "Start From: " );
		start = keyboard.nextInt();
		System.out.print( "Count by: " );
		count = keyboard.nextInt();
		
		for ( int i = start; i <= choice; i += count )
		{
			System.out.print( i+" ");
		}
		
		System.out.println();
	}
}
