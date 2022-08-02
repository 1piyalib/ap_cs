public class Deal
{
	//instance variables (DO NOT ADD ANY MORE)
	private int prizeLoc;
	private int userGuess;
	
	//(default) constructor
	public Deal()
	{
		setPrizeLoc();
		setUserGuess();
	}
	
	//modifier method for userGuess (should call random number method)
	public void setUserGuess()
	{
		userGuess = rand1to3();
	}
	
	//modifier method for prizeLoc (should call random number method)
	public void setPrizeLoc()
	{
		prizeLoc = rand1to3();
	}
	
	//accessor method for userGuess
	public int getUserGuess()
	{
		return userGuess;
	}
	
	//accessor method for prizeLoc
	public int getPrizeLoc()
	{
		return prizeLoc;
	}
	
	//method to generate random number between 1 & 3
	public int rand1to3(){
    int max = 3;
    int min = 1;
    int rand = (int)Math.floor(Math.random()*(max-min+1)+min);
    return(rand);
  }
  
	//method to reveal the door
	public int getView()
  {
    int result = 1;
    for (int i=1;i<=3;i++){
      if (i!=prizeLoc && i!=userGuess){
        result = i;
        break;
      }
    }
    return result;
  }
	
	//method to update user's guess
	//cant be userGuess and can't be reveal
  public int newGuess(){
    int result = 1;
    for (int i=1;i<=3;i++){
      if (i!=getView() && i!=userGuess){
        result = i;
        break;
      }
    }
    return result;
  }
	//toString method
	public String toString()
	{
		return "user guess: " + userGuess + " prizeLoc: " + prizeLoc;
	}
}
