// Create a class with various access modifiers
class AccessModifiersExample {
    // Private member variable
    private int privateVar = 10;

    // Public member variable
    public int publicVar = 20;

    // Protected member variable
    protected int protectedVar = 30;

    // Default (Package-Private) member variable
    int defaultVar = 40;

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (Package-Private) method
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

// Another class to demonstrate access to members of AccessModifiersExample
public class Main {
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();

        // Accessing members within the same class
        System.out.println("Private Variable: " + obj.privateVar); // Allowed within the same class
        obj.privateMethod(); // Allowed within the same class

        System.out.println("Public Variable: " + obj.publicVar); // Allowed from any class
        obj.publicMethod(); // Allowed from any class

        System.out.println("Protected Variable: " + obj.protectedVar); // Allowed within the same class
        obj.protectedMethod(); // Allowed within the same class

        System.out.println("Default Variable: " + obj.defaultVar); // Allowed within the same package
        obj.defaultMethod(); // Allowed within the same package
    }
}
