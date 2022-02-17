package io.github.w3code.helpers;

import io.github.w3code.drivers.BrowserstackMobileDriver;
import io.github.w3code.drivers.EmulationMobileDriver;

public class DeviceSelection {
    public static String getDeviceDriver(String deviceHost) {

        switch (deviceHost) {
            case "emulation":
                return EmulationMobileDriver.class.getName();
            case "browserstack":
                return BrowserstackMobileDriver.class.getName();
            default:
                throw new RuntimeException(String.format("Please select only " +
                        "emulation / browserstack in -DdeviceHost parameter"));
        }
    }
}
