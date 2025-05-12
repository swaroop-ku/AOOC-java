import java.util.Scanner;

// a. Student class
class Student {
    private int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

// b. Test class inherits Student
class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public int[] getMarks() {
        return new int[] {sub1, sub2};
    }
}

// c. Sports interface
interface Sports {
    int sMarks = 0; // default value (interface variables are final by default)

    void setSportsMarks(int marks);
}

// d. Result class
class Result extends Test implements Sports {
    private int sportsMarks;

    public void setSportsMarks(int marks) {
        this.sportsMarks = marks;
    }

    public void displayResult() {
        int total = sub1 + sub2 + sportsMarks;
        System.out.println("\n--- Result ---");
        System.out.println("Roll Number: " + getRollNo());
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + total);
    }
}

// e. Test application
public class StudentResultTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();

        // Input roll number
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        result.setRollNo(rollNo);

        // Input subject marks
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scanner.nextInt();
        result.setMarks(sub1, sub2);

        // Input sports marks
        System.out.print("Enter Sports Marks: ");
        int sportsMarks = scanner.nextInt();
        result.setSportsMarks(sportsMarks);

        // Display result
        result.displayResult();

        scanner.close();
    }
}
