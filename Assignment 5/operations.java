import MathOperations.floorop;
import MathOperations.roundop;
import MathOperations.ceilop;
import java.util.*;
class operations
{
	public static void main(String args[]){
		float n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextFloat();
		floorop f = new floorop();
		roundop r = new roundop();
		ceilop c = new ceilop();
		f.Floor(n);
		r.Round(n);
		c.Ceil(n);
	}
}