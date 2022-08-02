// If you are doing this correctly your code should not be more then 125 lines
// (including comments & blank lines separating the methods).
public class Collatz {
	// instance variables (aka members, fields)
    private int startNum;
    private int[] SequenceList = null;

    // default constructor
    public Collatz(){
        startNum = 1;
        SequenceList = sequence();
    }
    // initialization constructor
    //initialization constructor
    public Collatz(int initStartNum){
        startNum = initStartNum;
        SequenceList = sequence();
    }
    // Add a method called steps() that returns the number of steps
    // that are required for the starting number to reach 1.
    public int steps()
    {
        int step =0;
        if(startNum != 1) {
            int result = startNum;
            while (result != 1) {
                if (result % 2 == 0) {
                    result = result / 2;
                } else
                    result = result * 3 + 1;
                step++;
            }
        }
        return (step + 1);
    }
    // Add a method called sequence() that returns an array of the sequence of
    // numbers from the starting number to 1. Use your steps() function to
    // determine how the size of your array.
    public int[] sequence(){
        int[] sequence = new int[steps()];
        int result = startNum;
        sequence[0] = startNum;
        int index =1;
        while (result != 1) {
            if (result % 2 == 0) {
                result = result / 2;
            } else
                result = result * 3 + 1;
            sequence[index] = result;
            index++;
        }
        return(sequence);
    }
    // Add a method called maxValue() that returns the maximum value in the sequence.
    // Iterate through the values returned by a call to sequence().
    public int maxValue(){
        int max = Integer.MIN_VALUE;
        for(int x : SequenceList) {
            if (x > max)
                max =x;
        }
        return(max);
    }
    // A method called minOddValue() that returns the minimum value of all the odd numbers,
    // except for 1, in the sequence. Iterate through the values returned by a call to sequence().
    public int minOddValue(){
        int min_odd = Integer.MAX_VALUE;
        for(int x : SequenceList) {
            if (x%2 != 0 && x != 1) { //odd
                if(x < min_odd){
                    min_odd = x;
                }
            }
        }
        if (min_odd == Integer.MAX_VALUE)
            min_odd = 1;
        return(min_odd);
    }
    // Add a method called oddValues() that returns an array of all the odd numbers in the sequence.
    // Iterate through the values returned by a call to sequence().
    public int[] oddValues(){

        //find the number of odds
        int number_of_odd = 0;
        for(int x : SequenceList) {
            if (x%2 != 0) { //odd
                number_of_odd++;
            }
        }
        int[] oddvalue_list = new int[number_of_odd];
        int odd_index =0;
        for(int x : SequenceList) {
            if (x%2 != 0) { //odd
                oddvalue_list[odd_index] = x;
                odd_index++;
            }
        }
        return(oddvalue_list);
    }
    // Add a method called sumValues() that returns the sum of all the values in the sequence.
    // Iterate through the values returned by a call to sequence().
    public int sumValues(){
        int sum = 0;
        for(int x:SequenceList){
            sum = sum + x;
        }
        return(sum);
    }

    // Add a toString() method that returns ...    Starting number # takes # steps
    public String toString(){
        return("Starting Number " + String.valueOf(startNum) + " takes " + String.valueOf(steps()) + " steps");
    }
   
}

