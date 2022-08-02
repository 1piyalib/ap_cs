import java.util.Scanner;

public class Main     
{
	public static void main(String[] args)
	{
		double num1;
		double num2;
		char operator;
		//instantiate a Scanner
        Scanner scan = new Scanner(System.in);
        //prompt the user for the operator (how do you read in a character?)
        System.out.println("Enter the operator:");
        //assign the input from the user to operator variable
        operator =scan.next().charAt(0);
        //setup a set of conditions below to determine if the operator is valid
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            //get the remaining inputs from the user
            System.out.println("Enter the first operand:");
            num1 = scan.nextDouble();
            System.out.println("Enter the second operand:");
            num2 = scan.nextDouble();
            //check for division by zero
            if(operator == '/' && num2 == 0.0){
                System.out.println("Cannot Divide by Zero");
            }
            else{
                Calculator calc = new Calculator(num1,num2,operator);
                System.out.println("result = " + calc.calcResult());
                System.out.println(calc.toString());
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
        //instantiate Calculator object with the values entered by the user
        //call the toString() method to print the results
	}
}


