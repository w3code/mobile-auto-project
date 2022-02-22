package io.github.w3code.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    //locators and elements
    private final SelenideElement
            searchContainer = $(MobileBy.id("org.wikipedia.alpha:id/search_container"));

    //actions
    @Step("Check is search form exist")
    public MainPage checkSearchForm() {
        searchContainer.should(exist);
        return this;
    }
}
