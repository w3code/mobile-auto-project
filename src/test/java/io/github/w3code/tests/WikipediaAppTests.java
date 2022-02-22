package io.github.w3code.tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@DisplayName("Wikipedia mobile application tests")
public class WikipediaAppTests extends TestBase {

    @Test
    @DisplayName("Get Started pages test")
    @Tag("getstarted")
    void getStartedTest() {
        getStartedPage
                .checkPageText("The Free Encyclopedia …in over 300 languages")
                .tapOnContinueButton()
                .checkPageText("New ways to explore")
                .tapOnContinueButton()
                .checkPageText("Reading lists with sync")
                .tapOnContinueButton()
                .checkPageText("Send anonymous data")
                .tapOnGetStartedButton();

        mainPage.checkSearchForm();
    }
}
