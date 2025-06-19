interface Parent {
    void method1();
    void method2();
}

interface Child extends Parent {
    void method3();
    void method4();
}

class MyClass implements Child {


    @Override
    public void method3() {
        System.out.println("Method 3 from Child interface");
    }

    @Override
    public void method4() {
        System.out.println("Method 4 from Child interface");
    }

    @Override
    public void method1() {
        System.out.println("Method 1 from Parent interface");
    }
    @Override
    public void method2() {
        System.out.println("Method 2 from Parent interface");
    }

}



public class Interface_inheritance {
    public static void main(String[] args) {
        MyClass myClass= new MyClass();
        myClass.method1(); // Calls method1 from Parent interface
        myClass.method2(); // Calls method2 from Parent interface
        myClass.method3(); // Calls method3 from Child interface
        myClass.method4(); // Calls method4 from Child interface

    }
}
