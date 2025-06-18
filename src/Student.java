public class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    // Default constructor
    public Student(){};

    // Overloaded constructor
    public Student(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Method Overloading
    public void displayInfo(String additionalInfo) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Additional Info: " + additionalInfo);
    }
    // Method Overloading with different parameter types
    public void displayInfo(int additionalAge) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Additional Age: " + additionalAge);
    }
    // Method Overloading with different number of parameters
    public void displayInfo(String additionalInfo, int additionalAge) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Additional Info: " + additionalInfo);
        System.out.println("Additional Age: " + additionalAge);
    }
}
