//import Scanner
import java.util.Scanner;

public class Main
{
	//main method
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner scan = new Scanner(System.in);
		
		//prompt user for numerator
		System.out.println("Enter the numerator:");
	  //assign user input to variable
    int numerator;
		numerator = scan.nextInt();
		
		//prompt user for denominator
		System.out.println("Enter the denominator:");
		//assign user input to variable
		int denominator;
		denominator = scan.nextInt();
		
		//instantiate GCD object
    GCD gcd = new GCD(numerator,denominator);
		
		//call toString() method
		System.out.println(gcd.toString());

		//print fraction in lowest term
		System.out.println("The fraction in lowest terms is " + gcd.lowestNumerator() + "/" + gcd.lowestDenominator());

    scan.close();
	}
}