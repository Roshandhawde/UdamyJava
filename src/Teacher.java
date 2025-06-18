public class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher (String name , int age , String subject){
        super(name, age);
        this.subject=subject;
    }
// Default constructor
    public Teacher (){}


    // Overloaded constructor
    public Teacher(String subject) {
        super();
        this.subject = subject;
    }

    // Overloaded constructor
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    // Method Overloading
    public void displayInfo(String additionalInfo) {
        super.displayInfo(additionalInfo);
        System.out.println("Subject: " + subject);
    }

}
