package io.github.w3code.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GetStartedPage {
    //locators and elements
    private final SelenideElement
            primaryTextView = $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")),
            forwardButton = $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            doneButton = $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")),
            skipButton = $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"));

    //actions
    @Step("Check is \"{text}\" text exist")
    public GetStartedPage checkPageText(String text) {
        primaryTextView.shouldHave(text(text));
        return this;
    }

    @Step("Tap on SKIP button")
    public GetStartedPage tapOnSkipButton() {
        skipButton.click();
        return this;
    }

    @Step("Tap on CONTINUE button")
    public GetStartedPage tapOnContinueButton() {
        forwardButton.click();
        return this;
    }

    @Step("Tap on GET STARTED button")
    public GetStartedPage tapOnGetStartedButton() {
        doneButton.click();
        return this;
    }
}
