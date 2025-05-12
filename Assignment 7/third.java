import java.io.*;
import java.util.*;

class third {
    public static void main(String args[]) {
        int a, vowelCount = 0, aCount = 0;
        char c;
        a = 0;

        try {
            FileInputStream fin = new FileInputStream("sample.txt");

            while ((a = fin.read()) != -1) {
                c = (char) a;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelCount++;
                    if (c == 'a') {
                        aCount++;
                    }
                }
            }
            fin.close(); 

            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);
            int wordCount = 0;

            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            scanner.close();

           
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of 'a': " + aCount);
            System.out.println("Total number of words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
