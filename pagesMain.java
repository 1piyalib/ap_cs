// REPL.IT requires the root class be named "Main".  Normally you'd call this class
// something more descriptive such as Pages.
import java.util.Scanner;
public class Main 
{
   // main(): program starting point
   public static void main( String[] args ) 
   {
      // set up input scanner
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your age:");
      int age = scan.nextInt();
      int pagesRead = pages(age);
      System.out.println(age+" year olds should read at least "+pagesRead+" pages before giving up on a book");
      // get the age
      
      // call the pages method to compute the number of pages to be read
      
      // display result (pages to be read)
      
   }
   
   public static int pages(int usersAge) { 
      int pagesRead = 100-usersAge;
      return(pagesRead);
   }
}