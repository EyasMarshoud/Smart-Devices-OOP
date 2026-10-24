# Smart Devices

A small Java OOP example for managing a few types of smart devices.

## Files
- `SmartDevice.java`: abstract base class with shared details, an unchangeable ID, and a static device counter.
- `SmartLight.java`: supports switching on/off and Wi-Fi.
- `SmartFan.java`: supports switching on/off and adjusting its speed.
- `SmartCamera.java`: supports starting/stopping recording and Wi-Fi.
- `WiFiConnectable.java`: interface for devices that provide Wi-Fi functions.
- `Main.java`: runs a short demonstration.

Wi-Fi support is optional in this design: the light and camera implement `WiFiConnectable`, while the fan does not.

## Compile and run
Use a JDK from this directory:

```bash
javac *.java
java Main
```

The main method demonstrates repeated on/off and recording operations, speed control, Wi-Fi calls, polymorphic display, and the shared device count.
