Feature: Login feature

  @login
  Scenario: Valid admin login
    When user enters the valid username and password
    And click on login button
    Then user is successfully logged in