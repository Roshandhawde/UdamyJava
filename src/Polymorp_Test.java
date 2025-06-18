class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void sound(String type) {
        System.out.println("Dog barks in " + type + " way");
    }
    void sounds() {
        System.out.println("Dog barks in "  + " way");
    }
    void sounds(String type) {
        System.out.println("Dog barks in " + type + " way");
    }
}



public class Polymorp_Test {
    public static void main(String[] args) {
        Dog dog = new Dog();// Animal reference and object
        dog.sound(); // Calls the overridden method in Dog class overrides Animal's sound method
        dog.sound( "loudly"); // Calls the overloaded method in Dog class
        dog.sounds(); // Calls the overloaded method in Dog class
        dog.sounds( "softly"); // Calls the overloaded method in Dog class

    }

}


