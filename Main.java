import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Living Room Light", "Philips");
        SmartFan fan = new SmartFan("Bedroom Fan", "Samsung");
        SmartCamera camera = new SmartCamera("Front Door Camera", "TP-Link");

        // Light behavior
        light.turnOn();
        light.turnOn(); // The second call should not change its state.
        light.turnOff();
        light.turnOff(); // The second call should not change its state.

        // Fan behavior
        fan.turnOn();
        fan.adjustSpeed(3);
        fan.turnOff();

        // Camera behavior
        camera.startRecording();
        camera.startRecording();
        camera.stopRecording();

        // Wi-Fi is optional: this light and camera support it.
        light.connectToWiFi("HomeNetwork");
        camera.connectToWiFi("HomeNetwork");
        light.disconnectFromWiFi();

        // Polymorphism: one list holds all device types.
        ArrayList<SmartDevice> devices = new ArrayList<>();
        devices.add(light);
        devices.add(fan);
        devices.add(camera);

        System.out.println("\n--- Device Information ---");
        for (SmartDevice device : devices) {
            device.displayInfo();
        }

        System.out.println("\nTotal devices created: " + SmartDevice.getTotalDevices());
    }
}
