import java.util.*;
import java.lang.*;
class BankAccount
{
	float balance,draw;
	void balanceEnquiry(){
		balance = balance - draw;
		System.out.println("Total balance: "+balance);
	}
	void deposit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		balance = sc.nextFloat();
	}
	void withdraw(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw");
		draw = sc.nextFloat();
	}
}
class LowBalanceException extends Exception{
	public String toString(){
		return "withdrawal amount exceeds the available balance";
	}
}
class NegativeNumberException extends Exception{
	public String toString(){
		return "attempting to deposit or withdraw a negative amount.";
	}
}
class apply
{
	public static void main(String args[]){
		BankAccount b = new BankAccount();
		try{
			b.deposit();
			b.withdraw();
			if(b.balance < 0 || b.draw < 0)
			{
				throw new NegativeNumberException();
			}
			if(b.balance < b.draw)
			{
				throw new LowBalanceException();
			}
			b.balanceEnquiry();
		}
		catch(NegativeNumberException e){
			System.out.println(e);
		}
		catch(LowBalanceException e){
			System.out.println(e);
		}
	}
}