interface Phone{
    void call(String number);
    void sendMessage(String number, String message);
}

interface SmartDevice extends Phone {
    void browseInternet(String url);
    void installApp(String appName);
    default  void takePhoto() {
        System.out.println("Taking a photo");
    }
}

class SmartPhone implements Phone , SmartDevice {

    public void call(String number) {
        System.out.println("Calling " + number + " from SmartPhone.");
    }
    public void sendMessage(String number, String message) {
        System.out.println("Sending message: '" + message + "' to " + number + " from SmartPhone.");
    }
    public void browseInternet(String url) {
        System.out.println("Browsing internet: " + url + " from SmartPhone.");
    }
    public void installApp(String appName) {
        System.out.println("Installing app: " + appName + " on SmartPhone.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from SmartPhone.");
    }
}





public class Interfaces_class {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();

        myPhone.call("123-456-7890");
        myPhone.sendMessage("123-456-7890", "Hello, how are you?");
        myPhone.browseInternet("www.example.com");
        myPhone.installApp("Weather App");
        myPhone.takePhoto();
    }
}
