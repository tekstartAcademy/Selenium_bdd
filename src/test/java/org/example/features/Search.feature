Feature: Search Functionality
  As a user
  I want to successfully run search
  on google

  Scenario Outline: Search
    Given I am on google landing page
    When I enter a search "<word>"
    Then I see search "<word>" returned

    Examples:
      | word   |
      | Selenium Webdriver  |
      | Cypress|