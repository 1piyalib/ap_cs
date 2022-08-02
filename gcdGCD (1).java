public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
	private int numerator;
	private int denominator;
	
	//default constructor
	public GCD(){
    numerator = 0;
    denominator = 0;
  }
	
	//initialization constructor
	public GCD(int initNumerator, int initDenominator){
    numerator = initNumerator;
    denominator = initDenominator;
  }
	
	//modifier method for numerator
	public void setNumerator(int n1)
	{
		numerator = n1;
	}
	
	//modifier method for denominator
	public void setDenominator(int d1)
	{
		denominator = d1;
	}
	
	//accessor method for numerator
	public int getNumerator()
	{
		return numerator;
	}
	
	//accessor method for denominator
	public int getDenominator()
	{
		return denominator;
	}
	
	//method to determine gcd
	public int findGCD(){
    //Find the smaller of two as stating point
    int gcd = numerator;
    if(numerator >= denominator)
        gcd = denominator;
    //Find gcd
    while( !(numerator%gcd == 0 && denominator%gcd == 0)){
        if(gcd <= 1){
            gcd = 1;
            break;
        }
        gcd--;
    }
    return(gcd);
  }
	
	//method to determine lowest term of numerator
  public int lowestNumerator()
  {
    return(numerator/findGCD());
  }
	
	//method to determine lowest term of denominator
	public int lowestDenominator()
  {
    return(denominator/findGCD());
  }
	
	//toString() method (only return the GCD value)
	public String toString()
  {
    return("The GCD is: "+findGCD());
  }
}