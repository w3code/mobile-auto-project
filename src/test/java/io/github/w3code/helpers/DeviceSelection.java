package io.github.w3code.helpers;

import io.github.w3code.drivers.BrowserstackMobileDriver;
import io.github.w3code.drivers.EmulationMobileDriver;
import io.github.w3code.drivers.SelenoidMobileDriver;

public class DeviceSelection {
    public static String getDeviceDriver(String deviceHost) {

        switch (deviceHost) {
            case "emulation":
                return EmulationMobileDriver.class.getName();
            case "browserstack":
                return BrowserstackMobileDriver.class.getName();
            case "selenoid":
                return SelenoidMobileDriver.class.getName();
            default:
                throw new RuntimeException("Please select only " +
                        "emulation / browserstack / selenoid in -DdeviceHost parameter");
        }
    }
}
