package io.github.w3code.helpers;

import static io.github.w3code.drivers.SelenoidMobileDriver.selenoid;

public class Selenoid {
    public static String getVideoUrl(String sessionId) {
        return selenoid.videoUrl() + sessionId + ".mp4";

    }
}
