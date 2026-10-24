public abstract class SmartDevice {
    private final int id;
    private String name;
    private String brand;

    private static int totalDevices = 0;

    public SmartDevice(String name, String brand) {
        this.id = ++totalDevices;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public abstract void displayInfo();
}
