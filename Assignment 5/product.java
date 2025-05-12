package Ecommerce;
import java.util.*;
public class product
{	
	String p1,p2,p3;
	public float c1,c2,c3;
	public void order(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product 1");
		p1 = sc.nextLine();
		System.out.println("Enter cost of product 1");
		c1 = sc.nextFloat();
		sc.nextLine(); 
		System.out.println("Enter the product 2");
		p2 = sc.nextLine();
		System.out.println("Enter cost of product 2");
		c2 = sc.nextFloat();
		sc.nextLine(); 
		System.out.println("Enter the product 3");
		p3 = sc.nextLine();
		System.out.println("Enter cost of product 3");
		c3 = sc.nextFloat();
	}
	public void details(){
		System.out.println("product 1: "+p1);
		System.out.println("cost: "+c1+" Rs");
		System.out.println("product 2: "+p2);
		System.out.println("cost: "+c2+" Rs");
		System.out.println("product 3: "+p3);
		System.out.println("cost: "+c3+" Rs");
	}
}