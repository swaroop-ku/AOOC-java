import java.util.*;
import java.io.*;

class copy {
    public static void main(String args[]) {
        String name, city, phone;
        int age;
        float height, weight;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the city:");
        city = sc.nextLine();

        System.out.println("Enter the phone number:");
        phone = sc.nextLine();

        System.out.println("Enter the age:");
        age = sc.nextInt();

        System.out.println("Enter the height:");
        height = sc.nextFloat();

        System.out.println("Enter the weight:");
        weight = sc.nextFloat();

        // Writing using DataOutputStream
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.dat"));  // Using .dat for binary

            dos.writeUTF(name);
            dos.writeUTF(city);
            dos.writeUTF(phone);
            dos.writeInt(age);
            dos.writeFloat(height);
            dos.writeFloat(weight);

            dos.close();

            System.out.println("\nData written to file.");

            // Reading using DataInputStream
            System.out.println("\nReading data from file:");
            DataInputStream dis = new DataInputStream(new FileInputStream("sample.dat"));

            System.out.println("Name: " + dis.readUTF());
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone number: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Height: " + dis.readFloat());
            System.out.println("Weight: " + dis.readFloat());

            dis.close();
        } 
		catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
		catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
