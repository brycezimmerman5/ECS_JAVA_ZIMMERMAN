import java.util.Scanner;
public class TwoQuestions 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int matrix = 0;
		String q1, q2;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try and guess what it is!");
		
		System.out.println("Question 1) Is it an animal, vegetable or mineral?");
		q1 = keyboard.next();
		if( q1.equals("animal"))
		{
			matrix += 1;
		}
		if( q1.equals("vegetable"))
		{
			matrix += 2;
		}
		if( q1.equals("mineral"))
		{
			matrix += 3;
		}
		System.out.println("Question 2) Is it bigger than a breadbox?");
		q2 = keyboard.next();
		if( q2.equals("yes"))
		{
			matrix += 15;
		}
		if( q2.equals("no"))
		{
			matrix += 10;
		}
		if( matrix == 18)
		{
			System.out.println("Is it Camaro!?");	
		}
		if( matrix == 17)
		{
			System.out.println("Is it a Watermelon!?");
		}
		if( matrix == 16)
		{
			System.out.println("Is it a Moose!?");
		}
		if( matrix == 13)
		{
			System.out.println("Is it a Paperclip!?");
		}
		if( matrix == 12)
		{
			System.out.println("Is it a Carrot!?");
		}
		if( matrix == 11)
		{
			System.out.println("Is it a Squirrel!?");
		}


	}

}
