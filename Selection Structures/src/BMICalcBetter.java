import java.util.Scanner;

public class BMICalcBetter
{
	public static void main( String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		int pounds, feet, inches;
		System.out.println("BMI (Body Mass Index) is a way of representing your size");
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		System.out.println("How many pounds do you weigh?");
		pounds = keyboard.nextInt();
		
		System.out.println("Your BMI is: " +(pounds*0.4536)/((feet*0.3048+inches*0.0254)*(feet*0.3048+inches*0.0254)));
		 double bmi = (pounds*0.4536)/((feet*0.3048+inches*0.0254)*(feet*0.3048+inches*0.0254));
	if (bmi < 15)
	{
		System.out.println("You are underweight");	
	}
	if (bmi >= 18.5 && bmi <= 24.9)
	{
		System.out.println("You are normal");	
	}
	if (bmi >= 25 && bmi <= 29.9)
	{
		System.out.println("You are overweight");	
	}
	if (bmi > 30)
	{
		System.out.println("You are obese");	
	}
	}
	
}
