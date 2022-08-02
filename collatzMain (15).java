// Test you Collatz object
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("What is the start number for collatz?");
        int start = scan.nextInt();

        if (start > 0) {
            
            //System.out.println("Starting Number " + start); //correct but does not pass unit test
            System.out.print("Starting Number ");
            Collatz cz = new Collatz(start);
            System.out.println(cz.toString());
            int steps = cz.steps();
            System.out.println("Number of steps " + steps);
            int max = cz.maxValue();
            System.out.println("Maximum value " + max);
            int min_odd = cz.minOddValue();
            System.out.println("Minimum odd value " + min_odd);
            int[] odd_values = cz.oddValues();
            System.out.println("Odd values " + Arrays.toString(odd_values));
            int sum = cz.sumValues();
            System.out.println("Sum of all values " + sum);
            int[] sequence = cz.sequence();
            for (int i = 0; i < sequence.length; i++)
                System.out.printf("step %d %d\n", i + 1, sequence[i]);
        }
        else{
            System.out.println("Number of steps should be a positive number");
        }

    }
}
