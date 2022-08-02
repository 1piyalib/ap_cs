// Declare a Book class here.
//   Time to solo...
public class Book {
  private String bookName; //private because you don't want outside class to access the variable
  private int bookISBN; //No default value. Values are assigned through Constructor

  public Book(){
    bookName = "";
    bookISBN =0;
  }
  public Book(String initBookName, int initBookISBN){
    bookName = initBookName;
    bookISBN = initBookISBN;
  }
  public void setBookName(String name){
    bookName = name;
  }
  public String getBookName(){
    return(bookName);
  }
  public void setBookISBN(int isbn){
    bookISBN = isbn;
  }
   public int getBookISBN(){
    return(bookISBN);
  }
  public String toString(){
    return(bookName + " " + String.valueOf(bookISBN));
  }
}