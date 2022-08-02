import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+name+"!");
 
        System.out.println("How old are you?");
        String age = input.nextLine();
        int convert = Integer.valueOf(age);
        int ageInMonths = convert*12;
        System.out.println("Your age in months is "+ageInMonths+".");
 
        System.out.println("What is your favorite band?");
        String bandA = input.nextLine();
        System.out.println("What is your 2nd favorite band?");
        String bandB = input.nextLine();
        System.out.println("I like "+bandA+" and "+bandB+" too!!!");

    
  }
}