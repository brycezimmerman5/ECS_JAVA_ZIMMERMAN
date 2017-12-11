public class FillInMethodss
{
	public static void main( String[] args )
	{
		// Fill in the method calls where appropriate.

		System.out.println("Watch as we demonstrate methods.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = 'f';
	    c = randchar(c);
		System.out.println("The character is: " + c );

		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		counter(begin, end);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x = -10, y = abso(x);
		System.out.println("|" + x + "| = " + y );
	}
		

	


	public static void credits()
	// No parameters.
	{
		// displays some boilerplate text saying who wrote this program, etc.

		System.out.println();
		System.out.println("programmed by Sam Cummings");
		System.out.println("modified by [your name here]");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");

	}




	public static char randchar(char charval)

	{
		int numval;

	
		numval = (int)(Math.random()*26);
		charval = (char) ('A' + numval);

		return charval;
	}




	
		public static void counter(int start, int stop )
		// Parameters are:
		//     int start;
		//     int stop;
		{
			// counts from start to stop by ones
			int ctr;

			ctr = start;
			while ( ctr <= stop )
			{
				System.out.print(ctr + " ");
				ctr = ctr+1;
			}

		}


	




	public static int abso(int val)
	{
		// finds the absolute value of the parameter
		int absval;

		if ( val < 0 )
			absval = -val;
		else
			absval = val;

		return absval;
	}


}

