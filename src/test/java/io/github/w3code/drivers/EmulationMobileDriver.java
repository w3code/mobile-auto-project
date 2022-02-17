package io.github.w3code.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.github.w3code.config.EmulationConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.github.w3code.utils.FileUtils.getAbsolutePath;

public class EmulationMobileDriver implements WebDriverProvider {
    public static EmulationConfig emulation = ConfigFactory.create(EmulationConfig.class, System.getProperties());

    public static URL getEmulationUrl() {
        try {
            return new URL(emulation.hubUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("deviceName", emulation.deviceName());
        desiredCapabilities.setCapability("version", emulation.version());
        desiredCapabilities.setCapability("platformName", emulation.platformName());
        desiredCapabilities.setCapability("locale", emulation.locale());
        desiredCapabilities.setCapability("language", emulation.language());
        desiredCapabilities.setCapability("appPackage", emulation.appPackage());
        desiredCapabilities.setCapability("appActivity", emulation.appActivity());
        desiredCapabilities.setCapability("app", getAbsolutePath(emulation.app()));
        desiredCapabilities.setCapability("appium:appWaitForLaunch", false);

        return new AndroidDriver(getEmulationUrl(), desiredCapabilities);
    }
}
