package io.github.w3code.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.github.w3code.config.RealDeviceConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.github.w3code.utils.FileUtils.getAbsolutePath;

public class RealDeviceMobileDriver implements WebDriverProvider {
    public static RealDeviceConfig realDevice = ConfigFactory.create(RealDeviceConfig.class, System.getProperties());

    public static URL getRealDeviceUrl() {
        try {
            return new URL(realDevice.hubUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("deviceName", realDevice.deviceName());
        desiredCapabilities.setCapability("version", realDevice.version());
        desiredCapabilities.setCapability("platformName", realDevice.platformName());
        desiredCapabilities.setCapability("locale", realDevice.locale());
        desiredCapabilities.setCapability("language", realDevice.language());
        desiredCapabilities.setCapability("appPackage", realDevice.appPackage());
        desiredCapabilities.setCapability("appActivity", realDevice.appActivity());
        desiredCapabilities.setCapability("app", getAbsolutePath(realDevice.app()));
        desiredCapabilities.setCapability("appium:appWaitForLaunch", false);

        return new AndroidDriver(getRealDeviceUrl(), desiredCapabilities);
    }
}
