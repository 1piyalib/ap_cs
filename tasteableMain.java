// REPL.IT requires the root class be named "Main".  Normally you'd call this class
// something more descriptive such as Tasteable.


import java.util.Scanner;

public class Main 
{
   // method main(): program starting point
   public static void main( String[] args ) 
   {
      // set up input scanner
      int _shelfLife_=0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the shelf life:");
      _shelfLife_ = scan.nextInt();
      
      int bestTaste = 7+(_shelfLife_/2);
      System.out.println(_shelfLife_+" week shelf life tastes best when it is at least "+bestTaste+" weeks old");
      // get input
      
      // compute tasteable age
      
      // display result
      
   }
}