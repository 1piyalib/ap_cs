public class Main
{
	public static void main(String args[])
	{
		Book textBook = new Book();
		System.out.println(textBook.toString()); 
    Book textBook2 = new Book("Hitchhikers Guide to the Galaxy", 345391802);
    System.out.println(textBook2.toString()); 
	}
}