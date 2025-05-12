import java.util.*;
class Student
{
	int rollNo;
	void setRollNo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll number");
		rollNo = sc.nextInt();
	}
	void getRollNo(){
		System.out.println("roll No: "+rollNo);
	}
}
class Test extends Student
{
	float sub1,sub2;
	void setMarks(){
		setRollNo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of subject 1");
		sub1 = sc.nextFloat();
		System.out.println("Enter the marks of subject 2");
		sub2 = sc.nextFloat();
	}
	void getMarks(){
		getRollNo();
		System.out.println("Sub1: "+sub1);
		System.out.println("Sub2: "+sub2);

	}
}
interface Sports
{
	float sMarks = 99;
	void set();
}

class Result extends Test implements Sports
{	
	public void set(){
		setMarks();
		System.out.println("***Result***");
		getMarks();
		System.out.println("Sports: "+sMarks);
		System.out.println("Total: "+(((sub1+sub2+sMarks)/300)*100)+"%");
		
	}
	public static void main(String args[]){
		Result r = new Result();
		r.set();
	}
}