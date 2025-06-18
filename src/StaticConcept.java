public class StaticConcept {
    String name;
    int age;
    static String schoolName = "ABC High School"; // Static variable
    static int totalStudents = 0; // Static variable to keep track of total students
static void printInfo(){
 //   age = 20; // Static method can access static variables
System.out.println("School Name: " + schoolName );
}
}
