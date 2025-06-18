public class StaticInherit extends StaticConcept {
    // Static variable in the subclass
    static String className = "10th Grade";


    // Static method to display static variables
    public  void displayStaticInfo() {
        System.out.println("Name: " + name);
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Class Name: " + className);
        System.out.println( "Total Students in " + className + ": " + totalStudents);

    }


}
