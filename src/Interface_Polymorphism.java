interface Camera1 {
    void takePhoto();
    void recordVideo();
    private void adjustSettings() {
        System.out.println("Adjusting camera settings.");
    }
    default void settings(){
        adjustSettings();
        System.out.println("Camera settings adjusted.");
    }; // Abstract method to be implemented by classes that use this interface

    // Default method to take a selfie

    default void takeSelfie() {
        System.out.println("Taking a selfie.");
    }
}
interface wifi1  {
    void connectToWifi(String networkName);
    void disconnectFromWifi();
}
class MyCellPhone2 {
    void call(String number) {
        System.out.println("Calling " + number);
    }
    void sendMessage(String number, String message) {
        System.out.println("Sending message: '" + message + "' to " + number);
    }
}
class MySmartPhone1 extends MyCellPhone2 implements Camera1, wifi1 {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from MySmartPhone.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video from MySmartPhone.");
    }

    @Override
    public void connectToWifi(String networkName) {
        System.out.println("Connecting to WiFi network: " + networkName);
    }

    @Override
    public void disconnectFromWifi() {
        System.out.println("Disconnecting from WiFi.");
    }
}


public class Interface_Polymorphism {

    public static void main(String[] args) {
        Camera1 cam1 = new MySmartPhone1();
        cam1.takePhoto(); // Calls the method from MySmartPhone1
//        cam1.connectToWifi("HomeNetwork"); // Calls the method from MySmartPhone1 cannot be called here as cam1 is of type Camera1
//       cam1.connectToWifi("HomeNetwork"); // This line will cause a compile-time error because connectToWifi is not part of Camera1 interface

        cam1.settings(); // Calls the default method from Camera1 interface

        wifi1 wifi = new MySmartPhone1();
        wifi.connectToWifi("HomeNetwork"); // Calls the method from MySmartPhone1
        wifi.disconnectFromWifi(); // Calls the method from MySmartPhone1

        MyCellPhone2 phone = new MySmartPhone1();
        phone.call("123-456-7890"); // Calls the method from MyCellPhone2
        phone.sendMessage("123-456-7890", "Hello, how are you?"); // Calls the method from MyCellPhone2
    }
}
