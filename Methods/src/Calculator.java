import java.util.Scanner;

public class Calculator
{
	public static void main (String[] args)
	{
		double answer = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This is your calculator");
		System.out.println("Insert your calculation as '### operator ###'");

		boolean running=true;
		while (running=true)
		{
			System.out.print(">");
			int num1 = keyboard.nextInt();
			String opp = keyboard.next();
			int num2 = keyboard.nextInt();
	 
			if(opp.equals("+"))
			{
				add(num1 , num2);
				answer = add(num1 , num2);
				System.out.println(answer);
			}
			if(opp.equals("*"))
			{
				mult(num1 , num2);
				answer = mult(num1 , num2);
				System.out.println(answer);
			}
			if(opp.equals("-"))
			{
				subtract(num1 , num2);
				answer = subtract(num1 , num2);
				System.out.println(answer);
			}
			if(opp.equals("/"))
			{
				divide(num1 , num2);
				answer = divide(num1 , num2);
				System.out.println(answer);
			}
			if(opp.equals("^"))
			{
				square(num1 , num2);
				answer = square(num1 , num2);
				System.out.println(answer);
			}
		}
	 
	}
	public static int add(int num1, int num2)
	{
		int sum;
		sum = num1 + num2;
		return sum;
	}
	public static int mult(int num1, int num2)
	{
		int pro;
		pro = num1 * num2;
		return pro;
	}
	public static int divide(int num1, int num2)
	{
		int quo;
		quo =  num1 / num2;
		return quo;
	}
	public static int subtract(int num1, int num2)
	{
		int sum;
		sum = num1 - num2;
		return sum;
	}
	public static double square(int num1, int num2)
	{
		double squ;
		squ = Math.pow(num1,num2);
		return squ;
	}

}
