import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		//System.out.println("Hello world");
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		System.out.println("Enter 4 elements in the first array");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The first array is: ");
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				System.out.print((a[i][j])+" ");
			}
			System.out.println();
		}
		System.out.println("Enter 4 elements in the second array");
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("The second array is: ");
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				System.out.print((b[i][j])+" ");
			}
			System.out.println();
		}
		System.out.println("Addition of matrices:");
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of matrices");
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				for(int k = 0;k<2;k++)
				{
					c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
				}				
			}
		}
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				System.out.print((c[i][j])+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of a First matrix:");
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				c[j][i] = a[i][j];
			}
		}
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				System.out.print((c[i][j])+" ");
			}
			System.out.println();
		}

	}//end of main
}//end of class