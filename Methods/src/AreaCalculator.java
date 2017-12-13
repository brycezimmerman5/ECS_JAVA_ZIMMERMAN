import java.util.Scanner;

public class AreaCalculator 
{
	public static void main( String[] args)
	{
		int answer;
		Scanner keyboard = new Scanner(System.in);
		System.out.print(" 1) Triangle ");
		System.out.print(" 2) Rectangle ");
		System.out.print(" 3) Square ");
		System.out.print(" 4) Circle ");
		System.out.println(" 5) Quit ");
		System.out.println("Which Shape: ");
		answer = keyboard.nextInt();
		double areat = 0, arear = 0, areac = 0;
		
		if (answer == 1)
		{
			int base;
			System.out.print("Base: ");
			base = keyboard.nextInt();
			
			int height;
			System.out.print("Height: ");
			height = keyboard.nextInt();
		    areat(base, height);
		 
		}
		if (answer == 2)
		{
			int b;
			System.out.print("Base: ");
			b = keyboard.nextInt();
			
			int h;
			System.out.print("Height ");
			h = keyboard.nextInt();
			arear(b, h);
		}
		if (answer == 3)
		{
			int b;
			System.out.print("Base: ");
			b = keyboard.nextInt();
			
			int h;
			System.out.print("Height ");
			h = keyboard.nextInt();
			arear(b,h);
		}
		if (answer == 4)
		{
			int r;
			System.out.print("Radius: ");
			r = keyboard.nextInt();
			
			areac(r);
		}
		if (answer == 5)
		{
			System.out.println("Ok then, Bye.");
		}
		
	}
	public static void areat(int base, int height)
	{
		
		double areat;
		areat = (base*height)/2;
		System.out.println("the area is: " +areat);
	}
	public static void arear(int base, int height)
	{
		double arear;
		arear = (base*height);
		System.out.println("the area is: " +arear);
	}
	public static void areac(int r)
	{
		double areac;
		areac = ((r*r)*Math.PI);
		System.out.println("the area is: " +areac);
	}




}
