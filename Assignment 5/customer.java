package Ecommerce;
import java.util.*;
public class customer
{	
	String name;
	public void cust(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sc.nextLine();
	}
	public void cdetail(){
		System.out.println("Name: "+name);
	}
}