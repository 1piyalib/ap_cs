// name:  
// purpose: demonstrate further method prowess

public class Invoke 
{
   // method piggyBank(): returns what the change is worth in cents
	public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars){
    int total = pennies + nickels*5 + dimes*10 + quarters*25 + halfDollars*50;
    return(total);
  }
  // method mp3Sizer(): estimates the number of gB needed to store media
  public static int mp3Sizer(int songs, int videos, int photos){
    int fin = (int)Math.ceil((songs*3.04+videos*89.3+photos*1.72)/1000.0);
    return(fin);
  }


	 
	
}