public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
       Student student1 = new Student();
         student1.name = "John Doe";
            student1.age = 20;
        student1.displayInfo();
        Student student2= new Student();
        student2.name = "Jane Smith";
        student2.age = 22;
        student2.displayInfo();

       StaticInherit in1= new StaticInherit();

        in1.name = "Alice";
        in1.age = 15;
        in1.totalStudents=232; // this is bad practice, static variables should be accessed through the class name
        StaticConcept.totalStudents = 233; // this is the correct way to access static variables

        in1.displayStaticInfo();
        StaticInherit in2= new StaticInherit();

        in2.name = "john";
        in2.age = 30;

        in2.displayStaticInfo();


    }
}