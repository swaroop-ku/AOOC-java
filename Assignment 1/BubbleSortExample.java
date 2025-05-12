import java.util.*;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        // Input
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Output
        System.out.println("Sorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
