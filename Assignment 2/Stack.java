import java.util.*;
class Stack
{	
	public static int s;
	public static int a[];
	public static int top = -1;
	public static void push(){
		int n;
		if(top == s-1){
			System.out.println("stack is overflow");
		}
		else{
			top++;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the element");
			n = sc.nextInt();
			a[top] = n;
		}
		System.out.println("Stack: ");
		for(int i = top;i>=0;i--){
			System.out.print(" "+a[i]);
		}
	}

	public static void pop(){
		int n1;
		if(top == -1){
			System.out.println("stack is Empty");
		}
		else{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the element to pop");
			n1 = sc.nextInt();
			top--;
		}
		System.out.println("Stack: ");
		for(int i = top;i>=0;i--){
			System.out.print(" "+a[i]);
		}
	}

	public static void main(String args[]){
		int ch,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		s = sc.nextInt();

		a = new int[s];

		do{
			System.out.println("1:Push");
			System.out.println("2:Pop");
			ch = sc.nextInt();
			switch(ch){
				case 1:
				push();
				break;

				case 2:
				pop();
				break;
			}
			if (i == s-1) { 
				System.out.println();
                		//System.out.println("Stack is full! No more elements can be pushed.");
                		break;
            		}
			 else {
			 System.out.println();
                         System.out.println("Do you want to continue? If yes, press 1, if no, press 0");
                         int p = sc.nextInt();
                		if (p == 0) {
                    			break; 
                		}
            		}
			i++;
		}while(i<s);

	}
}