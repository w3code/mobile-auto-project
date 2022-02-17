package io.github.w3code.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.w3code.drivers.BrowserstackMobileDriver;
import io.github.w3code.drivers.EmulationMobileDriver;
import io.github.w3code.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.github.w3code.helpers.Attach.getSessionId;
import static io.github.w3code.helpers.DeviceSelection.getDeviceDriver;

public class TestBase {
    private static final String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    public static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.browser = getDeviceDriver(deviceHost);
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void startDriver() {
        open();
    }

    @AfterEach
    public void afterEach() {
        if(deviceHost.equals("browserstack")) {
            String sessionId = getSessionId();
            Attach.attachVideo(sessionId);
        }
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        closeWebDriver();
    }
}
