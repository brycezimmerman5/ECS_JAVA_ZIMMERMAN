import java.util.Scanner;
public class AskingQuestions 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		name = "Big Shaq";
		age = 21;
		feet = 10;
		weight = 200;
		inches = 1;
		
		System.out.println("What is your name?");
		System.out.println("How old are you?");
		System.out.println("How many feet tall are you?");
		System.out.println("How many inches?");
		System.out.println("How much do you weigh?");
		System.out.println("So your name is " +name+ ", you are " +age+ " years old, you're " +feet+ "'" +inches+ ", and you weigh " +weight+ " pounds.");
	}

}
