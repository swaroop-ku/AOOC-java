import mathematical.solve;
import mathematical.convert.conversion;
import java.util.*;
class result
{
	public static void main(String args[]){
		solve s = new solve();
		conversion c = new conversion();
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a = sc.nextInt();
		s.factorial(a);
		s.cube(a);
		c.answer(a);
		String b;
		System.out.println("Enter the binary number");
		b = sc.next();
		c.binary(b);
		System.out.println("Enter the octal number");
		b = sc.next();
		c.octal(b);
		System.out.println("Enter the hexadecimal number");
		b = sc.next();
		c.hexadecimal(b);

	}
}