public class Static_Block {
    String name;
    int age;
    static String schoolName  ; // Static variable

    // Static block to initialize static variables
    static {
        schoolName="ABC High School";
        System.out.println("Static block executed: School Name initialized to " + schoolName);
        // You can perform other static initializations here if needed
    }

    // constructor
    public Static_Block(String name, int age) {
        this.name = name;
        this.age = age;
        // this.schoolName = schoolName; // Assigning static variable to instance variable
        System.out.println("Constructor called: " + name + ", Age: " + age);
    }

}
