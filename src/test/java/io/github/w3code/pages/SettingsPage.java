package io.github.w3code.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class SettingsPage {
    //locators and elements
    private final SelenideElement
            wikipediaLanguages = $(By.xpath("//android.widget.TextView[@text=\"Wikipedia languages\"]")),
            aboutWikipedia = $(By.xpath("//android.widget.TextView[@text=\"About the Wikipedia app\"]")),
            buildVersion = $(MobileBy.id("org.wikipedia.alpha:id/about_version_text"));

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

    @Step("Move to About block")
    public SettingsPage moveToAboutBlock() {
        AndroidElement element =
                (AndroidElement) WebDriverRunner.getWebDriver().findElement
                        (MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
                                ".index(0)).scrollIntoView(new UiSelector().text(\"About the Wikipedia app\"))"));
        return this;
    }

    @Step("Tap on About the Wikipedia app")
    public SettingsPage tapAboutWikipediaApp() {
        aboutWikipedia.click();
        return this;
    }

    @Step("Verify build version")
    public SettingsPage verifyBuildVersion(String version) {
        buildVersion.shouldHave(text(version));
        return this;
    }
}
