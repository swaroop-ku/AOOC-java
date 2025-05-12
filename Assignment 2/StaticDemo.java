public class StaticDemo {

    // Static variable
    static int staticCount;

    // Instance variable
    int instanceCount;

    // Static block (runs once when the class is loaded)
    static {
        System.out.println("Static block executed.");
        staticCount = 10;
    }

    // Constructor
    public StaticDemo() {
        staticCount++;
        instanceCount++;
        System.out.println("Constructor called. Static count: " + staticCount + ", Instance count: " + instanceCount);
    }

    // Static method
    static void displayStaticCount() {
        System.out.println("Static count is: " + staticCount);
        // Cannot access instanceCount here because it's not static
    }

    // Instance method
    void displayInstanceCount() {
        System.out.println("Instance count is: " + instanceCount);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        StaticDemo.displayStaticCount();  // Call static method without creating object

        // Create objects
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        // Call instance methods
        obj1.displayInstanceCount();
        obj2.displayInstanceCount();

        // Call static method again
        StaticDemo.displayStaticCount();
    }
}
