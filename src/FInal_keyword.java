
// final Class Cannot be extended
// final variable cannot be updated
class AA{
    String name;
    final int age = 20; // Final variable, cannot be changed
public void AA(String name) {
        this.name = name;
    }

    // Default constructor
    public AA() {}

    // Overloaded constructor
    public AA(String name) {
        this.name = name;
        // this.age = age; // Cannot assign a value to final variable 'age'
    }

    public void AA(){};

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // Accessing final variable
    }
}
class BB extends AA {
    // Cannot override final variable 'age'
    // int age = 30; // This will cause a compile-time error
    String subject;

    // Constructor
    public BB(String name, String subject) {
        super(name);

        this.subject = subject;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // Accessing final variable from parent class
        System.out.println("Subject: " + subject);
    }
}



public class FInal_keyword {
    public static void main(String[] args) {

        BB bb= new BB("John", "Mathematics");
        bb.displayInfo(); // Displaying information using the overridden method
    }
}
