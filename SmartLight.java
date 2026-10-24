public class SmartLight extends SmartDevice implements WiFiConnectable {
    private boolean on;
    private boolean connected;

    public SmartLight(String name, String brand) {
        super(name, brand);
        this.on = false;
        this.connected = false;
    }

    public void turnOn() {
        if (on) {
            System.out.println("Light is already ON.");
            return;
        }
        on = true;
        System.out.println("Light turned ON.");
    }

    public void turnOff() {
        if (!on) {
            System.out.println("Light is already OFF.");
            return;
        }
        on = false;
        System.out.println("Light turned OFF.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Smart Light | ID: " + getId()
                + " | Name: " + getName()
                + " | Brand: " + getBrand()
                + " | Status: " + (on ? "ON" : "OFF")
                + " | Wi-Fi: " + (connected ? "Connected" : "Disconnected"));
    }

    @Override
    public void connectToWiFi(String networkName) {
        if (connected) {
            System.out.println("Light is already connected to Wi-Fi.");
            return;
        }
        connected = true;
        System.out.println("Light connected to " + networkName);
    }

    @Override
    public void disconnectFromWiFi() {
        if (!connected) {
            System.out.println("Light is already disconnected from Wi-Fi.");
            return;
        }
        connected = false;
        System.out.println("Light disconnected from Wi-Fi.");
    }
}
