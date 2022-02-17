package io.github.w3code.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.github.w3code.config.SelenoidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SelenoidMobileDriver implements WebDriverProvider {
    public static SelenoidConfig selenoid = ConfigFactory.create(SelenoidConfig.class, System.getProperties());

    public static URL getSelenoidUrl() {
        try {
            return new URL("https://" + selenoid.user() + ":" + selenoid.password() + "@" + selenoid.hubUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private URL getApkUrl() {
        try {
            return new URL(selenoid.app());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("deviceName", selenoid.deviceName());
        desiredCapabilities.setCapability("version", selenoid.version());
        desiredCapabilities.setCapability("platformName", selenoid.platformName());
        desiredCapabilities.setCapability("locale", selenoid.locale());
        desiredCapabilities.setCapability("language", selenoid.language());
        desiredCapabilities.setCapability("app", getApkUrl());
        desiredCapabilities.setCapability("appPackage", selenoid.appPackage());
        desiredCapabilities.setCapability("appActivity", selenoid.appActivity());
        desiredCapabilities.setCapability("enableVNC", true);
        desiredCapabilities.setCapability("enableVideo", true);

        return new AndroidDriver(getSelenoidUrl(), desiredCapabilities);
    }
}
