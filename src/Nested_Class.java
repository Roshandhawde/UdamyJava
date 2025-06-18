class A{
void display(){
    System.out.println("Hello from class a");
}


    // Nested class b
    class B{
        void display(){
            System.out.println("Hello from class b");
        }
    }
}


public class Nested_Class {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.display(); // Calls method from class A

        A.B obj2 = obj1.new B(); // Creating an instance of the nested class B
        obj2.display(); // Calls method from nested class B
        // Alternatively, you can create an instance of the nested class B directly
        // A.B obj2 = new A().new B(); // This also works



    }
}
