import java.util.Scanner;
public class UserInputOfData 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int grade, id;
		String firstname, lastname, login;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		System.out.println("First name: ");
		firstname = keyboard.next();
		System.out.println("Last name: ");
		lastname = keyboard.next();
		System.out.println("Grade (9-12): ");
		grade = keyboard.nextInt();
		System.out.println("Student ID: ");
		id = keyboard.nextInt();
		System.out.println("Login: ");
		login = keyboard.next();
		System.out.println("GPA (0,0-4,0): ");
		gpa = keyboard.nextInt();
		
		System.out.println("Your information:");
		System.out.println("Login: " +login);
		System.out.println("Student ID: " +id);
		System.out.println("Name: " +firstname+ ", " +lastname);
		System.out.println("GPA: " +gpa);
		System.out.println("Grade: " +grade); 
		
	}

}
