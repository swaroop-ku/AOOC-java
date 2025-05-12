import java.util.*;
class Employee
{
	String first,last;
	float salary;
	Employee(){
		System.out.println("Enter the first name");
		Scanner sc = new Scanner(System.in);
		first = sc.nextLine();
		System.out.println("Enter the last name");
		last = sc.nextLine();
		System.out.println("Enter the monthly salary");
		salary = sc.nextFloat();
	}
	void getter(int hike){
		System.out.println();
		System.out.println("First Name: "+first);
		System.out.println("Last Name: "+last);
		float year = 12*(salary);
		if(hike != 10){
			System.out.println("yearly salary: "+year);
		}
		else{
			//year = 12*(salary + (salary*(10/100)));
			float x = salary/10;
			//System.out.println("x: "+x);
			year = 12*(salary+x);
			System.out.println("Salary after 10% hike");
			System.out.println("yearly salary: "+year);
		}
	}
}
class Employeetest
{
	public static void main(String args[])
	{
		Employee s1 = new Employee();
		s1.getter(0);
		s1.getter(10);
	}
}