package io.github.w3code.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GetStartedPage {
    //locators and elements
    private final SelenideElement
            primaryTextView = $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")),
            forwardButton = $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            doneButton = $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")),
            skipButton = $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
            addOrEditLanguage = $(MobileBy.id("org.wikipedia.alpha:id/addLangContainer")),
            addLanguage = $(By.xpath("//android.widget.TextView[@text=\"Add language\"]")),
            navigateUp = $(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")),
            sendUsageData = $(MobileBy.id("org.wikipedia.alpha:id/switchView"));

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

    @Step("Tap on ADD OR EDIT LANGUAGES")
    public GetStartedPage tapOnAddOrEditLanguages() {
        addOrEditLanguage.click();
        return this;
    }

    @Step("Tap on ADD LANGUAGE")
    public GetStartedPage tapOnAddLanguage() {
        addLanguage.click();
        return this;
    }

    @Step("Select language")
    public GetStartedPage selectLanguage(String language) {
        $(By.xpath("//android.widget.TextView[@text=\"" + language + "\"]")).click();
        return this;
    }

    @Step("Navigate up")
    public GetStartedPage navigateUp() {
        navigateUp.click();
        return this;
    }

    @Step("Disable send usage data")
    public GetStartedPage disableSendUsageData() {
        sendUsageData.click();
        return this;
    }

}
