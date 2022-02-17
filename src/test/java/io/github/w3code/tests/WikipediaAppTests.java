package io.github.w3code.tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class WikipediaAppTests extends TestBase {

    @Test
    void getStartedTest() {
        step("Check is \"The Free Encyclopedia …in over 300 languages\" text exist", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                        .shouldHave(text("The Free Encyclopedia …in over 300 languages")));

        step("Tap on CONTINUE button", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Check is \"New ways to explore\" text exist", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore")));

        step("Tap on CONTINUE button", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Check is \"Reading lists with sync\" text exist", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync")));

        step("Tap on CONTINUE button", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Check is \"Send anonymous data\" text exist", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Send anonymous data")));

        step("Tap on GET STARTED button", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click());

        step("Check is search form exist", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/search_container")).should(exist));
    }
}
