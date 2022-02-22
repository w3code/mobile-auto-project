package io.github.w3code.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    //locators and elements
    private final SelenideElement
            searchForm = $(MobileBy.id("org.wikipedia.alpha:id/search_container")),
            searchField = $(MobileBy.id("org.wikipedia.alpha:id/search_container")).$(".android.widget.TextView"),
            searchFieldText = $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")),
            itemTitle = $(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title")),
            moreButton = $(MobileBy.id("org.wikipedia.alpha:id/nav_more_container")),
            settingsSelect = $(MobileBy.id("org.wikipedia.alpha:id/main_drawer_settings_container"));

    private final ElementsCollection
            searchResults = $(MobileBy.id("org.wikipedia.alpha:id/search_results_list")).$$("android.view.ViewGroup");

    //actions
    @Step("Check is search form exist")
    public MainPage checkSearchForm() {
        searchForm.should(exist);
        return this;
    }

    @Step("Fill search field")
    public MainPage fillSearchField(String searchPhrase) {
        searchField.click();
        searchFieldText.setValue(searchPhrase);
        return this;
    }

    @Step("Check results are existing")
    public MainPage checkResults() {
        searchResults.shouldHave(sizeGreaterThan(0));
        return this;
    }

    @Step("Check {searchPhrase} result")
    public MainPage checkSearchedResult(String searchPhrase) {
        itemTitle.shouldHave(text(searchPhrase));
        return this;
    }

    @Step("Tap more button")
    public MainPage tapMoreButton() {
        moreButton.click();
        return this;
    }

    @Step("Tap on settings")
    public MainPage tapOnSettings() {
        settingsSelect.click();
        return this;
    }
}
