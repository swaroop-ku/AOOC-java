import java.util.Scanner;

// Base class
class BankAccount {
    protected double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to check balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method to add minimum balance restriction
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot fall below $100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(initialBalance);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = scanner.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = scanner.nextDouble();
                    account.withdraw(withAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
