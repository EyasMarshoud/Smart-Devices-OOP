public class SmartCamera extends SmartDevice implements WiFiConnectable {
    private boolean recording;
    private boolean connected;

    public SmartCamera(String name, String brand) {
        super(name, brand);
        this.recording = false;
        this.connected = false;
    }

    public void startRecording() {
        if (recording) {
            System.out.println("Camera is already recording.");
            return;
        }
        recording = true;
        System.out.println("Recording started.");
    }

    public void stopRecording() {
        if (!recording) {
            System.out.println("Camera is not recording.");
            return;
        }
        recording = false;
        System.out.println("Recording stopped.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Smart Camera | ID: " + getId()
                + " | Name: " + getName()
                + " | Brand: " + getBrand()
                + " | Recording: " + (recording ? "Yes" : "No")
                + " | Wi-Fi: " + (connected ? "Connected" : "Disconnected"));
    }

    @Override
    public void connectToWiFi(String networkName) {
        if (connected) {
            System.out.println("Camera is already connected to Wi-Fi.");
            return;
        }
        connected = true;
        System.out.println("Camera connected to " + networkName);
    }

    @Override
    public void disconnectFromWiFi() {
        if (!connected) {
            System.out.println("Camera is already disconnected from Wi-Fi.");
            return;
        }
        connected = false;
        System.out.println("Camera disconnected from Wi-Fi.");
    }
}
