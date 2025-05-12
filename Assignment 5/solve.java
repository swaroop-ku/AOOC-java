package mathematical;

public class solve
{
	public void factorial(int a){
		int fact = 1;
		for(int i = a;i>0;i--){
			fact = fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
	public void cube(int a){
		System.out.println("Cube: "+(a*a*a));
	}
}