// add import statements
import java.util.Scanner;
import java.io.*;

// create class AliceCount (For REPL.IT this class would be "Main")
class Main {
  

	// create main method - remember to throw the exception
	public static void main(String[] args) throws FileNotFoundException{
	
		// instantiate Scanner object using text file "alice.txt".
    Scanner in = new Scanner(new File("alice.txt")); 
		

		// instatiate PrintWriter with output file name
    PrintWriter out = new PrintWriter(new FileOutputStream("output.txt"));
    
		// create variable to track the number of words in the text
    int numOfWords = 0;
		// create variable to track each of the letters
    int numOfE = 0;
    int numOfT = 0;
    int numOfA = 0;
    int numOfO = 0;
    int numOfI = 0;
		
		// loop through the file		
    while(in.hasNextLine()){
		
			// read in the word one at a time
      String word = in.next();
			
			// increment the word counter
      numOfWords = numOfWords +1;
			
      boolean wordHasLetter = false;

			// check to see if the letter occurs in the word
      if (word.toUpperCase().indexOf("E")!=-1){
        numOfE++;
        wordHasLetter = true;
      }

			if (word.toUpperCase().indexOf("T")!=-1){
        numOfT++;
        wordHasLetter = true;
      }

      if (word.toUpperCase().indexOf("A")!=-1){
        numOfA++;
        wordHasLetter = true;
      }

      if (word.toUpperCase().indexOf("O")!=-1){
        numOfO++;
        wordHasLetter = true;
      }

      if (word.toUpperCase().indexOf("I")!=-1){
        numOfI++;
        wordHasLetter = true;
      }
			// increment the letter counter

				
				// write the word to the output file
			if (wordHasLetter)
        out.write(word.replaceAll("[^a-zA-Z---]","") +"\n");
    }
		// calculate the percentage of words containing the character
		
    System.out.println("Words with the letter 'e' = " + numOfE);
		System.out.println("Total number of Words = " + numOfWords);

    System.out.println("Percentage of words containing the letter 'e' is " + Math.round((double)numOfE/(double)numOfWords *100.0 * 100.0)/100.0 + "%");

    System.out.println("Percentage of words containing the letter 't' is " + Math.round((double)numOfT/(double)numOfWords *100.0 *  100.0)/100.0 + "%");

    System.out.println("Percentage of words containing the letter 'a' is " + Math.round((double)numOfA/(double)numOfWords * 100.0 * 100.0)/100.0 + "%");

    System.out.println("Percentage of words containing the letter 'o' is " + Math.round((double)numOfO/(double)numOfWords * 100.0 * 100.0)/100.0 + "%");

    System.out.println("Percentage of words containing the letter 'i' is " + Math.round((double)numOfI/(double)numOfWords *100.0 *  100.0)/100.0 + "%");

		//  close the files
    out.close();
    in.close();
		
    }
}