//import Scanner
import java.util.Scanner;
// DealRunner
public class Main
{
	public static void main(String[] args)
	{
		    //instantiate Scanner object
    Scanner scan = new Scanner(System.in);
    
    //prompt the user for the number of simulations to run
    System.out.println("How many simulations do you want to run?");
    
    //assign input to variable

    double amount = scan.nextDouble();
    int prizeLoc = 0;
    int userGuess = 0;
    int doorRevealed = 0;
    int newGuess = 0;
    double winCount = 0;
    boolean winSwitch;
    for(int i =0; i<amount;i++) {
      Deal dealer = new Deal();
      prizeLoc = dealer.getPrizeLoc();
      userGuess = dealer.getUserGuess();
      doorRevealed = dealer.getView();
      newGuess = dealer.newGuess();
      if (newGuess == prizeLoc){
        winCount++;
        winSwitch = true;
      }
      else {
        winSwitch = false;
      }
      System.out.println("prize:" + prizeLoc + " guess:" + userGuess + " revealed:" + doorRevealed + " new guess:" + newGuess + " win if switching:" + winSwitch + " win if not switching:" + !winSwitch);
    }

    System.out.println("Probability of winning if you don't switch = " + (1.00-((double)winCount/amount)));
    System.out.println("Probability of winning if you switch = " + winCount/amount);
    scan.close();

    //declare variables to store stopping condition for loop, prize loc, user guess,
      //door revealed, the new guess, and wins by changing
    
    
    //loop through the number of simulations
    
    
      //instantiate a Deal object inside the loop
      
      
      //get the user's guess and assign to a variable 
      
      
      //get the prize location and assign to a variable
      
      
      //get the door which is revealed and assign to a variable
      
      
      //get the new guess and assign to a variable
      
      
      //increment counter for loop
      
      
      //determine if the new guess matches the prize location
      
      
      
      //increment the win count by changing
        
        
        
      //output the variables for each simulation
      
      
    }
    //output the probability of winning/not winning by switching
    
    
  }