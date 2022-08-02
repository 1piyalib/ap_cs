// Try to write the WHOLE program. See if you can define the class and 
// main method from memory.  Remember repl.it requires the class containing
// the main method to be named Main.
import java.util.Scanner;

public class Main 
{

  public static void main( String[] args ) 
  {
    double lengthJellybean=0;
    double heightJellybean = 0;
    int sizeJar = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter jelly bean length (cm):");
    lengthJellybean = scan.nextDouble();
    System.out.println("Enter jelly bean height (cm):");
    heightJellybean = scan.nextDouble();
    System.out.println("Enter jar size (mL):");
    sizeJar = scan.nextInt();
    // double finalLen=(int)(sizeJar / (5 * Math.PI * lengthJellybean * ((heightJellybean * heightJellybean) / 24))* 0.698);
    System.out.println("Estimate for number of jelly beans with average");
    System.out.println("length: "+lengthJellybean+" cm");
    System.out.println("height: "+heightJellybean+" cm");
    System.out.println("in a jar of size "+sizeJar+" mL is");
    System.out.println((int)volume(lengthJellybean, heightJellybean, sizeJar));
  }
  public static int volume(double length, double height, int sizeJar){
    return (int)(sizeJar / (5 * Math.PI * length * ((height * height) / 24))* 0.698);
  }
}