package io.github.w3code.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class SettingsPage {
    //locators and elements
    private final SelenideElement
            wikipediaLanguages = $(By.xpath("//android.widget.TextView[@text=\"Wikipedia languages\"]"));

    private final ElementsCollection
            languagesList = $$(MobileBy.id("org.wikipedia.alpha:id/wiki_language_title"));

    //actions
    @Step("Tap on Wikipedia languages")
    public SettingsPage tapWikipediaLanguages() {
        wikipediaLanguages.click();
        return this;
    }

    @Step("Verify \"{language}\" language in list")
    public SettingsPage verifyLanguage(String language) {
        for (SelenideElement languageName : languagesList) {
            if (String.valueOf(languageName).equals(language)) {
                assertThat(String.valueOf(languageName).equals(language));
                break;
            }
        }
        return this;
    }
}
