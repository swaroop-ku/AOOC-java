import java.lang.*;
import java.util.*;
class OddNumberException extends Exception
{
	 public String toString(){
		return "odd number entered";
	}
}
class oddcheck
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a = sc.nextInt();
		try{
			if(a%2 != 0){
				throw new OddNumberException();
			}
		}
		catch(OddNumberException e){
			System.out.println(e);
		}
	}
}