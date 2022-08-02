// Try to write the WHOLE program. See if you can define the class and 
// main method from memory.  Remember repl.it requires the class containing
// the main method to be named Main.
import java.util.Scanner;
public class Main{
  public static void main( String[] args )
  {
      final int dripsPerGallon = 15140;
      double dripsPerMinute = 0;
      int numOfDays = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter faucet drips per minute:");
      dripsPerMinute = scan.nextDouble();

      System.out.println("Enter number of days:");
      numOfDays = scan.nextInt();
      double waste = (((dripsPerMinute*60)*24)*numOfDays)/dripsPerGallon;
      System.out.println("A faucet with "+dripsPerMinute+" drips per minute over "+numOfDays+" days will waste "+waste+" gallons of water");

}
}