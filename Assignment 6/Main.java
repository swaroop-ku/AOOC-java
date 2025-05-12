import ExceptionHandlingDemo.calculator;
import ExceptionHandlingDemo.DivisionException;
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		calculator c = new calculator();
		try{
			if(b == 0){
				throw new DivisionException();
			}
			c.division(a,b);
		}
		catch(DivisionException e){
			System.out.println(e);
		}
	}
}