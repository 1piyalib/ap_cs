class Main {

    public static void main (String[] args) {
      int x = 27;
      System.out.println("x = " + x);
      x = x + 1;
      System.out.println("x = " + (x+1));
      /*it prints out 281 because java reads the print statement as two strings, and it adds them together as strings, not integers.*/
      System.out.println("x = " + x);
      /*the variable x has already been assigned to 27+1 in the previous print statement.*/
  
      x = 2147483647; //syntax error if there are commas
      System.out.println("x = " + x);
      x = x + 1;
      System.out.println("x = " + (x+1)); //is greater than the limit->becomes negative
      System.out.println("x = " + x); //is greater than the limit->becomes negative
      System.out.println("x = " + Integer.MAX_VALUE); //biggest int available
      System.out.println("x = " + Integer.MIN_VALUE); //smallest int available

      double y = 6.2;
      System.out.println("y = " + y);
      y = 27;
      System.out.println("y = " + y); //prints out 27.0
      //"x = 6.2;" prints an error because 6.2 is not an integer
      char a = '$';
      System.out.println("a = " + a);
      a = '\'';
      System.out.println("a = " + a);
      String b = "Hello";
      String c = "World";
      System.out.print(b+"\n"+"\\"+"\n"+c);
      float DAYS_PER_WEEK = 7;
      int days = 212;
      float numb = days/DAYS_PER_WEEK;
      System.out.println("\n" +days + " days is " + (numb)+ " weeks.");
      int e = 6;
      int f = 27;
      System.out.println(e+" + "+f+" = "+(e+f)+" (not 627)");
      double g = 5.8*2;
      double h = 2.5;
      System.out.println("integer part of g / h = "+(int)(g/h));
    }
}
