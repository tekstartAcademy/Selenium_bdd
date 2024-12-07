Feature: Login Functionality
  As a user
  I want to log in to the application
  So that I can access my dashboard

  Scenario Outline: Login
    Given I am on the login page
    When I enter "<username>" and "<password>"
    Then I should be redirected to the dashboard

    Examples:
      | username   | password   |
      | validUser  | validPass  |
      | anotherUser | anotherPass |
