public class BhattacharyaPSweden extends AbstractLocale{
  
  public BhattacharyaPSweden(){
    super("Sweden", "Swedish");
  }

  public String getGreeting(){
    return "Hello";
  }

  public String getCurrencySymbol(){
    return "kr";
  }
  public double getCurrencyValue(double c){
    return c*9.85;
  }
  
}