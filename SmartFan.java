public class SmartFan extends SmartDevice {
    private boolean on;
    private int speed;

    public SmartFan(String name, String brand) {
        super(name, brand);
        this.on = false;
        this.speed = 0;
    }

    public void turnOn() {
        if (on) {
            System.out.println("Fan is already ON.");
            return;
        }
        on = true;
        System.out.println("Fan turned ON.");
    }

    public void turnOff() {
        if (!on) {
            System.out.println("Fan is already OFF.");
            return;
        }
        on = false;
        speed = 0;
        System.out.println("Fan turned OFF.");
    }

    public void adjustSpeed(int speed) {
        if (!on) {
            System.out.println("Turn on the fan before adjusting its speed.");
        } else if (speed < 1 || speed > 5) {
            System.out.println("Speed must be between 1 and 5.");
        } else {
            this.speed = speed;
            System.out.println("Fan speed set to " + speed + ".");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Smart Fan | ID: " + getId()
                + " | Name: " + getName()
                + " | Brand: " + getBrand()
                + " | Status: " + (on ? "ON" : "OFF")
                + " | Speed: " + speed);
    }
}
