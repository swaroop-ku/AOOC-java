package LibraryManagement;
import java.util.*;
public class member
{	
	String name;
	int days;
	public void setm(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		name = sc.nextLine();
		System.out.println("Enter the number of days");
		days = sc.nextInt();
	}
	public void getm(){
		System.out.println("Name: "+name);
		System.out.println("No of days: "+days);
	}
}
