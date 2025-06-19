abstract class A1 {

    abstract void display();

    abstract void show();

   // Concrete method
    void greet() {
        System.out.println("Hello from A1");
    }
}





public class Abstract_class {
    public static void main(String[] args) {
//A1 obj1= new A1() ;  // This line would cause a compilation error because A1 is abstract and cannot be instantiated directly.

        // Creating an anonymous subclass of A1
        A1 obj = new A1() {
            @Override
            void display() {
                System.out.println("Display method implementation");
            }

            @Override
            void show() {
                System.out.println("Show method implementation");
            }
        };

        // Calling methods
        obj.display();
        obj.show();
        obj.greet(); // Calling the concrete method from A1
    }
}
