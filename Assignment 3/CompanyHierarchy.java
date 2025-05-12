import java.util.Scanner;

// Base class
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }

    public void generatePerformanceReport() {
        System.out.println(jobTitle + " " + name + " has met the performance standards.");
    }

    public void manageProject() {
        System.out.println(jobTitle + " " + name + " is working on a general project.");
    }

    public void displayInfo() {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
}

// Subclass: Manager
class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    public void manageProject() {
        System.out.println("Manager " + name + " is managing the company-wide strategic project.");
    }
}

// Subclass: Developer
class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    public void manageProject() {
        System.out.println("Developer " + name + " is developing the new application module.");
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public void manageProject() {
        System.out.println("Programmer " + name + " is coding and debugging assigned tasks.");
    }
}

// Main class
public class CompanyHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Manager
        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        String mName = scanner.nextLine();
        System.out.print("Address: ");
        String mAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double mSalary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        Manager manager = new Manager(mName, mAddress, mSalary);

        // Input for Developer
        System.out.println("\nEnter Developer Details:");
        System.out.print("Name: ");
        String dName = scanner.nextLine();
        System.out.print("Address: ");
        String dAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double dSalary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        Developer developer = new Developer(dName, dAddress, dSalary);

        // Input for Programmer
        System.out.println("\nEnter Programmer Details:");
        System.out.print("Name: ");
        String pName = scanner.nextLine();
        System.out.print("Address: ");
        String pAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double pSalary = scanner.nextDouble();

        Programmer programmer = new Programmer(pName, pAddress, pSalary);

        // Display info and methods
        System.out.println("\n=== Manager Report ===");
        manager.displayInfo();
        manager.generatePerformanceReport();
        manager.manageProject();

        System.out.println("\n=== Developer Report ===");
        developer.displayInfo();
        developer.generatePerformanceReport();
        developer.manageProject();

        System.out.println("\n=== Programmer Report ===");
        programmer.displayInfo();
        programmer.generatePerformanceReport();
        programmer.manageProject();

        scanner.close();
    }
}
