import java.util.*;

class Queue {
    public static int s;        // Size of the queue
    public static int[] a;      // Array to hold queue elements
    public static int front = -1; // Front of the queue
    public static int rear = -1;  // Rear of the queue

    // Enqueue method to add an element to the rear of the queue
    public static void enqueue() {
        int n;
        if (rear == s - 1) { // If the queue is full
            System.out.println("Queue overflow");
        } else {
            if (front == -1) {
                front = 0;  // If the queue is empty, set front to 0
            }
            rear++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the element to enqueue:");
            n = sc.nextInt();
            a[rear] = n;
        }
        // Print the current queue elements
        System.out.println("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println(); // For a new line after printing the queue
    }

    // Dequeue method to remove an element from the front of the queue
    public static void dequeue() {
        if (front == -1) { // If the queue is empty
            System.out.println("Queue underflow");
        } else {
            int dequeuedElement = a[front];
            System.out.println("Dequeued element: " + dequeuedElement);
            front++;
            if (front > rear) { // If the queue is empty after dequeueing
                front = rear = -1; // Reset the front and rear pointers
            }
        }
        // Print the current queue elements
        System.out.println("Queue: ");
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println(); // For a new line after printing the queue
    }

    public static void main(String args[]) {
        int ch;
        Scanner sc = new Scanner(System.in);

        // Input the size of the queue
        System.out.println("Enter the size of the queue:");
        s = sc.nextInt();
        a = new int[s]; // Initialize the queue array with the size 's'

        do {
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    enqueue(); // Enqueue operation
                    break;

                case 2:
                    dequeue(); // Dequeue operation
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // If the queue is full, prevent further enqueues
            if (rear == s - 1) {
                System.out.println("Queue is full! No more elements can be enqueued.");
                break; // Exit the loop when the queue is full
            }

            // Ask the user if they want to continue if the queue is not full
            System.out.println("Do you want to continue? If yes, press 1, if no, press 0");
            int p = sc.nextInt();
            if (p == 0) {
                break; // Exit the loop if the user doesn't want to continue
            }

        } while (true); // The loop continues until the user chooses to stop
    }
}
