interface Camera {
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
interface wifi {
    void connectToWifi(String networkName);
    void disconnectFromWifi();
}
class MyCellPhone {
    void call(String number) {
        System.out.println("Calling " + number);
    }
    void sendMessage(String number, String message) {
        System.out.println("Sending message: '" + message + "' to " + number);
    }
}
 class MySmartPhone extends MyCellPhone implements Camera, wifi {
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
public class Interface_javaHarry {
}
