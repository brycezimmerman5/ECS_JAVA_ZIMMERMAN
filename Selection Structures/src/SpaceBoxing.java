import java.util.Scanner;
public class SpaceBoxing 
{
	public static void main( String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			int weight, planet;
			
			System.out.println("Please enter your current earth weight: ");
			weight = keyboard.nextInt(); 
			
			System.out.println("I have the information for the following planets:");
			System.out.println(" 1. Venus	 2. Mars	3. Jupiter");
			System.out.println(" 4. Saturn	5. Uranus	6. Neptune");
			
			System.out.println("Which planet are you visiting?");
			planet = keyboard.nextInt();
			
			if (planet == 1)
			{
				System.out.println("Your weight would be " +(0.78 * weight));
			}
			if (planet == 2)
			{
				System.out.println("Your weight would be " +(0.39 * weight));
			}
			if (planet == 3)
			{
				System.out.println("Your weight would be " +(2.65 * weight));
			}
			if (planet == 4)
			{
				System.out.println("Your weight would be " +(1.17 * weight));
			}
			if (planet == 5)
			{
				System.out.println("Your weight would be " +(1.05 * weight));
			}
			if (planet == 6)
			{
				System.out.println("Your weight would be " +(1.23 * weight));
			}
			
			
		}

}
