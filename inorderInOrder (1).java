public class InOrder
{
	private int numOne;
	private int numTwo;
	private int numThree;
	
	public InOrder()
	{
		// complete default constructor
		
	}
	
	public InOrder(int n1, int n2, int n3)
	{
		// complete initialization constructor
    numOne = n1;
    numTwo = n2;
    numThree = n3;
		
	}
	
	public void setNumOne(int n1)
	{
		// complete modifier method for numOne
    numOne = n1;
	}
	
	// add modifier method for numTwo
  public void setNumTwo(int n2)
	{
    numTwo = n2;
	}
	
	// add modifier method for numThree
  public void setNumThree(int n3)
	{
    numThree = n3;
	}
	
	public int getNumOne()
	{
		// complete accessor method for numOne
    return(numOne);
	}
	
	// add accessor method for numTwo
	public int getNumTwo()
	{
	
    return(numTwo);
	}
	public int getNumThree()
	{
		// complete accessor method for numOne
    return(numThree);
	}
	// add method that returns a boolean indicating that the 
	// instance variables are in order or not 
	// i.e. numOne is the smallest, numThree is the largest

/*
Enter x, y, and z:
3 <= 5 <= 4 is
false
The correct order is 3 <= 4 <= 5*/

	public boolean lowhigh(){
    if( (numOne<=numTwo) && (numTwo<=numThree)){
        return(true);
      }
      else{
        return(false);
      }
    }

  public String lowmidhigh(){
    int low = numOne;
    int mid = numTwo;
    int high = numThree;
    int temp = 0;
    if(lowhigh() == true){
      return(numOne + " <= " + numTwo + " <= " + numThree +  " is\ntrue");
    }
    
    if(low>mid){
      temp = low;
      low = mid;
      mid = temp;
    }
    if (low>high){
      temp = low;
      low = high;
      high = temp;
    }
    if (mid>high){
      temp = mid;
      mid = high;
      high = temp;
    }
    return(numOne + " <= " + numTwo + " <= " + numThree +  " is\nfalse" + "\nThe correct order is "+low+" <= "+mid+" <= "+high);
  }
  
	// add a VOID method to put the instance variables in order
  // numOne = lowest value, numTwo = middle value, numThree = highest value	
	
	
	public String toString()
	{
		return "" + numOne + " " + numTwo + " " + numThree;
	}
}

