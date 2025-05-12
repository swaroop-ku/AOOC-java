import java.util.Scanner;

// Interface Stack
interface Stack {
    int size = 5; // Default size of stack
    void push(int value);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// Class implementing Stack
class IntegerStack implements Stack {
    int[] stack = new int[size];
    int top = -1;

    public void push(int value) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        } else {
            int popped = stack[top--];
            System.out.println("Popped: " + popped);
            return popped;
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// Test class
public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerStack stack = new IntegerStack();

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
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
