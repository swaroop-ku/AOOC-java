import java.util.*;
class Prime
{
	public static void main(String args[])
	{	
		int x = Integer.parseInt(args[0]);
		int flag = 0;
		//Scanner sc = new Scanner(System.in);
		if(x == 1)
		{
			System.out.println("1 is not a prime number");
		}
		if(x != 1)
		{
			for(int i =2;i<x;i++)
			{
				if(x%i == 0)
				{
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0 && x != 1)
		{
			System.out.println("It is a prime number "+x);
		}
		if(flag != 0)
		{
			System.out.println("It is not a prime number "+x);
		}
	}//end of main
}//end of class