package io.github.w3code.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Wikipedia mobile application tests")
public class WikipediaAppTests extends TestBase {

    @Test
    @DisplayName("Get Started pages test")
    @Tag("GetStartedTest")
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

    @Test
    @DisplayName("Search test")
    @Tag("SearchTest")
    void searchTest() {
        String searchPhrase = "Appium";

        getStartedPage.tapOnSkipButton();

        mainPage
                .checkSearchForm()
                .fillSearchField(searchPhrase)
                .checkResults()
                .checkSearchedResult(searchPhrase);
    }

    @Test
    @DisplayName("Add language test")
    @Tag("AddLanguageTest")
    void addLanguageTest() {
        String language = "Русский";

        getStartedPage
                .checkPageText("The Free Encyclopedia …in over 300 languages")
                .tapOnAddOrEditLanguages()
                .tapOnAddLanguage()
                .selectLanguage(language)
                .navigateUp()
                .tapOnSkipButton();

        mainPage
                .tapMoreButton()
                .tapOnSettings();

        settingsPage
                .tapWikipediaLanguages()
                .verifyLanguage(language);
    }
}