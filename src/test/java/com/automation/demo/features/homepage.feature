@homepage
Feature: Google Homepage Tests
    Example test automating searching for a string on the google homepage

    Background: Navigate to the Google homepage
        Given I am on the page "https://www.google.com/"

    @homepage-search
    Scenario: Verify that I see search results in Google
        When I enter the text "selenium" in the "search" text field
        And I click on the "google search" element
        Then I should see google search results