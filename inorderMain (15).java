import java.util.Scanner;
import java.util.*;

public class Main
{
	// main(): program starting point
	public static void main( String[] args ) 
	{
		// set up scanner to read input from user
		
		
		// prompt the user for input
		System.out.println( "Enter x, y, and z:" );
		
		//use the scanner to read in the input
		 Scanner scan = new Scanner(System.in);
     int x = scan.nextInt();
		 int y = scan.nextInt();
     int z = scan.nextInt();
   
		// create InOrder object by calling the initialization constructor
		InOrder firstTry = new InOrder(x,y,z);
		System.out.println(firstTry.lowmidhigh());
		// call the method in InOrder you created to determine whether the numbers 
		//were in order. Remember to put the method call inside a print statement

		
    }
}