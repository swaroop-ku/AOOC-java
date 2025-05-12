package LibraryManagement;
import java.util.*;
public class Books
{	
	String title,author,ISBN;
	public void set(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book");
		title = sc.nextLine();
		System.out.println("Enter the name of the author");
		author = sc.nextLine();
		System.out.println("Enter the ISBN number");
		ISBN = sc.nextLine();
	}
	public void get(){
		System.out.println("Title of book: "+title);
		System.out.println("Author of book: "+author);
		System.out.println("ISBN no of book: "+ISBN);
	}
}
