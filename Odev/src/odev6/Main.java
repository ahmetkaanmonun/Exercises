package odev6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Device device1 = new Device();
        device1.brand="Iphone";
        device1.deviceModel = "XS";
        device1.os = "MacOS";
        device1.osVersion = 14 ;

        Device device2 = new Device();
        device2.brand="Lg";
        device2.deviceModel = "G";
        device2.os = "Android";
        device2.osVersion = 7 ;

        Device device3 = new Device();
        device3.brand="Samsung";
        device3.deviceModel = "S3 Mini";
        device3.os = "Android";
        device3.osVersion = 12 ;

        Device device4 = new Device();
        device4.brand="Iphone";
        device4.deviceModel = "6";
        device4.os = "MacOS";
        device4.osVersion = 9 ;

        Device device5 = new Device();
        device5.brand="Xiaomi";
        device5.deviceModel = "RedMi Note";
        device5.os = "Android";
        device5.osVersion = 13 ;

        List<Device> devices = new ArrayList<Device>();
        devices.add(device1);
        devices.add(device2);
        devices.add(device3);
        devices.add(device4);
        devices.add(device5);

        devices.forEach((device) -> System.out.println(device.brand + " - " + device.deviceModel));
    }


}
